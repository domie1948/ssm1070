package com.zsCat.web.goods.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.github.abel533.easyxls.EasyXls;
import com.github.abel533.easyxls.bean.ExcelConfig;
import com.github.pagehelper.PageInfo;
import com.zsCat.common.utils.FileUtils;
import com.zsCat.web.goods.model.GoodsClass;
import com.zsCat.web.goods.service.GoodsClassService;

@Controller
@RequestMapping("goodsClass")
public class GoodsClassController {

	@Resource
	private GoodsClassService GoodsClassService;

	@RequestMapping
	public String toGoodsClass(Model model) {
		model.addAttribute("treeList", JSON.toJSONString(GoodsClassService.select(new GoodsClass())));
		return "goods/goodsClass/goodsClass";
	}

	/**
	 * 区域树
	 * @return
	 */
	@RequestMapping(value = "tree", method = RequestMethod.POST)
	public @ResponseBody List<GoodsClass> getGoodsClassTreeList() {
		List<GoodsClass> list = GoodsClassService.select(new GoodsClass());
		return list;
	}

	/**
	 * 添加或更新区域
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public @ResponseBody Integer save(@ModelAttribute GoodsClass goodsGoodsClass) {
		goodsGoodsClass.setParentIds(goodsGoodsClass.getParentIds()+goodsGoodsClass.getParentId()+","); 
		return GoodsClassService.saveGoodsClass(goodsGoodsClass);
	}

	/**
	 * 删除区域及其子区域
	 * 
	 * @param resourceId
	 *            区域id
	 * @return
	 */
	@RequestMapping(value = "delete", method = RequestMethod.POST)
	public @ResponseBody Integer dels(Long id) {
		Integer count = 0;
		if (null != id) {
			count = GoodsClassService.deleteByPrimaryKey(id);
		}
		return count;
	}

	/**
	 * 分页显示区域table
	 * 
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "list", method = RequestMethod.POST)
	public String list(int pageNum,int pageSize,@ModelAttribute GoodsClass GoodsClass, Model model) {
		PageInfo<GoodsClass> page = GoodsClassService.selectPage(pageNum, pageSize, GoodsClass);
		model.addAttribute("page", page);
		return "goods/goodsClass/goodsClass-list";
	}

	/**
	 * 弹窗
	 * 
	 * @param id
	 * @param parentId
	 *            父类id
	 * @param mode
	 *            模式(add,edit,detail)
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "{mode}/showlayer", method = RequestMethod.POST)
	public String showLayer(Long id, Long parentId,
			@PathVariable("mode") String mode, Model model) {
		GoodsClass goodsClass = null, pGoodsClass = null;
		if (StringUtils.equalsIgnoreCase(mode, "add")) {
			pGoodsClass = GoodsClassService.selectByPrimaryKey(parentId);
		} else if (StringUtils.equalsIgnoreCase(mode, "edit")) {
			goodsClass = GoodsClassService.selectByPrimaryKey(id);
			pGoodsClass = GoodsClassService.selectByPrimaryKey(parentId);
		} else if (StringUtils.equalsIgnoreCase(mode, "detail")) {
			goodsClass = GoodsClassService.selectByPrimaryKey(id);
			pGoodsClass = GoodsClassService.selectByPrimaryKey(goodsClass.getParentId());
		}
		model.addAttribute("pGoodsClass", pGoodsClass).addAttribute("goodsClass", goodsClass);
		return mode.equals("detail") ? "goods/goodsClass/goodsClass-detail"
				: "goods/goodsClass/goodsClass-save";
	}

	
	/**
	 * execl导入数据
	 * @throws IOException
	 */
	@RequestMapping(value = "import",method = RequestMethod.POST)
	public @ResponseBody void importFile(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		ExcelConfig config = new ExcelConfig.Builder(GoodsClass.class)
				.sheetNum(0)
				.startRow(1)
				.separater(",")
				.addColumn("name", "code,java.lang.String", "pname",
						"parentId,java.lang.Long", "parentIds", "type", "icon",
						"delFlag", "remarks", "createBy",
						"createDate,java.util.Date", "updateBy",
						"updateDate,java.util.Date").build();
		int count = 0;
		try {
			List<Map<String,Object>> list = (List<Map<String, Object>>) EasyXls.xls2List(config,
					FileUtils.uploadFile(request));
			//goodstem.out.println(list);
			for(int i=0;i<list.size();i++){
				GoodsClass goodsClass=new GoodsClass();
				transMap2Bean2(list.get(i),goodsClass);
				GoodsClassService.insertSelective(goodsClass);
				count++;
			}
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().write("成功导入"+count + "条数据!");
		} catch (Exception e) {
			response.getWriter().write("导入失败");
			e.printStackTrace();
		}

	}

	// Map --> Bean 2: 利用org.apache.commons.beanutils 工具类实现 Map --> Bean  
    public static void transMap2Bean2(Map<String, Object> map, Object obj) {  
        if (map == null || obj == null) {  
            return;  
        }  
        try {  
            BeanUtils.populate(obj, map);  
        } catch (Exception e) {  
          //  goodstem.out.println("transMap2Bean2 Error " + e);  
        }  
    }  
}
