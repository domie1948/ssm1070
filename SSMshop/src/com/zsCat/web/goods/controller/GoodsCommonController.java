package com.zsCat.web.goods.controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.zsCat.web.goods.service.GoodsCommonService;
import com.github.pagehelper.PageInfo;
import com.zsCat.web.goods.model.GoodsCommon;
	/**
	 * 
	 * @author zsCat 2016-10-31 14:07:34
	 * @Email: 951449465@qq.com
	 * @version 4.0v
	 *	商品管理
	 */
@Controller
@RequestMapping("goodsCommon")
public class GoodsCommonController {

	@Resource
	private GoodsCommonService GoodsCommonService;
	
	@RequestMapping
	public String toGoodsCommon(Model model){
		return "goods/goodsCommon/goodsCommon";
	}
	
	/**
	 * 添加或更新区域
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public @ResponseBody Integer save(@ModelAttribute GoodsCommon GoodsCommon) {
		return GoodsCommonService.saveGoodsCommon(GoodsCommon);
	}
	
	/**
	 * 删除字典
	* @param id
	* @return
	 */
	@RequestMapping(value="delete",method=RequestMethod.POST)
	public @ResponseBody Integer del(@ModelAttribute GoodsCommon GoodsCommon){
		return GoodsCommonService.deleteGoodsCommon(GoodsCommon);
	}
	
	/**
	 * 分页显示字典table
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "list", method = RequestMethod.POST)
	public String list(int pageNum,int pageSize,@ModelAttribute GoodsCommon GoodsCommon, Model model) {
		PageInfo<GoodsCommon> page = GoodsCommonService.selectPage(pageNum, pageSize, GoodsCommon);
		model.addAttribute("page", page);
		return "goods/goodsCommon/goodsCommon-list";
	}
	
	@RequestMapping(value="{mode}/showlayer",method=RequestMethod.POST)
	public String showLayer(Long id, Model model){
		GoodsCommon goodsCommon = GoodsCommonService.selectByPrimaryKey(id);
		model.addAttribute("goodsCommon", goodsCommon);
		return "goods/goodsCommon/goodsCommon-save";
	}
	
}
