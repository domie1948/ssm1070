package com.zsCat.web.goods.controller;


import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.zsCat.web.goods.model.ShopType;
import com.zsCat.web.goods.service.ShopTypeService;
import com.zsCat.web.sys.model.SysResource;
	/**
	 * 
	 * @author zs 2016-5-24 21:52:07
	 * @Email: 951449465@qq.com
	 * @version 4.0v
	 *	我的goods
	 */
@Controller
@RequestMapping("shopType")
public class ShopTypeController {

	@Resource
	private ShopTypeService ShopTypeService;
	
	@RequestMapping
	public String toShopType(Model model) {
		model.addAttribute("treeList", JSON.toJSONString(ShopTypeService.select(null)));
		return "goods/shopType/shopType";
	}

	/**
	 * 区域树
	 * @return
	 */
	@RequestMapping(value = "tree", method = RequestMethod.POST)
	public @ResponseBody List<ShopType> getShopTypeTreeList() {
		List<ShopType> list = ShopTypeService.select(null);
		return list;
	}
	
	/**
	 * 添加或更新区域
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public @ResponseBody Integer save(@ModelAttribute ShopType ShopType,HttpServletRequest request) {
		if(ShopType.getParentIds()!="" &&ShopType.getParentIds()!=null){
			ShopType.setParentIds(ShopType.getParentIds()+ShopType.getParentId()+","); 
		}else{
			ShopType.setParentIds(ShopType.getParentId()+","); 
		}
		
		return ShopTypeService.saveShopType(ShopType);
	}
	
	/**
	 * 删除字典
	* @param id
	* @return
	 */
	@RequestMapping(value="delete",method=RequestMethod.POST)
	public @ResponseBody Integer del(@ModelAttribute ShopType ShopType){
		return ShopTypeService.deleteShopType(ShopType);
	}
	
	/**
	 * 分页显示字典table
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "list", method = RequestMethod.POST)
	public String list(@RequestParam Map<String, Object> params, Model model) {
		PageInfo<ShopType> page = ShopTypeService.findPageInfo(params);
		model.addAttribute("page", page);
		return "goods/shopType/shopType-list";
	}
	

	@RequestMapping(value = "{mode}/showlayer", method = RequestMethod.POST)
	public String showLayer(Long id, Long parentId,
			@PathVariable("mode") String mode, Model model) {
		ShopType shopType = null, pShopType = null;
		if (StringUtils.equalsIgnoreCase(mode, "add")) {
			pShopType = ShopTypeService.selectByPrimaryKey(parentId);
		} else if (StringUtils.equalsIgnoreCase(mode, "edit")) {
			shopType = ShopTypeService.selectByPrimaryKey(id);
			pShopType = ShopTypeService.selectByPrimaryKey(parentId);
		} else if (StringUtils.equalsIgnoreCase(mode, "detail")) {
			shopType = ShopTypeService.selectByPrimaryKey(id);
			pShopType = ShopTypeService.selectByPrimaryKey(shopType.getParentId());
		}
		model.addAttribute("pShopType", pShopType).addAttribute("shopType", shopType);
		return mode.equals("detail") ? "goods/shopType/shopType-detail"
				: "goods/shopType/shopType-save";
	}
	
}
