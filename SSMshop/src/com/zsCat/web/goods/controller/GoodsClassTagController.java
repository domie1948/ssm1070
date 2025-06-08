package com.zsCat.web.goods.controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.zsCat.web.goods.service.GoodsClassTagService;
import com.github.pagehelper.PageInfo;
import com.zsCat.web.goods.model.GoodsClassTag;
	/**
	 * 
	 * @author zsCat 2016-10-31 14:07:00
	 * @Email: 951449465@qq.com
	 * @version 4.0v
	 *	商品管理
	 */
@Controller
@RequestMapping("goodsClassTag")
public class GoodsClassTagController {

	@Resource
	private GoodsClassTagService GoodsClassTagService;
	
	@RequestMapping
	public String toGoodsClassTag(Model model){
		return "goods/goodsClassTag/goodsClassTag";
	}
	
	/**
	 * 添加或更新区域
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public @ResponseBody Integer save(@ModelAttribute GoodsClassTag GoodsClassTag) {
		return GoodsClassTagService.saveGoodsClassTag(GoodsClassTag);
	}
	
	/**
	 * 删除字典
	* @param id
	* @return
	 */
	@RequestMapping(value="delete",method=RequestMethod.POST)
	public @ResponseBody Integer del(@ModelAttribute GoodsClassTag GoodsClassTag){
		return GoodsClassTagService.deleteGoodsClassTag(GoodsClassTag);
	}
	
	/**
	 * 分页显示字典table
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "list", method = RequestMethod.POST)
	public String list(int pageNum,int pageSize,@ModelAttribute GoodsClassTag GoodsClassTag, Model model) {
		PageInfo<GoodsClassTag> page = GoodsClassTagService.selectPage(pageNum, pageSize, GoodsClassTag);
		model.addAttribute("page", page);
		return "goods/goodsClassTag/goodsClassTag-list";
	}
	
	@RequestMapping(value="{mode}/showlayer",method=RequestMethod.POST)
	public String showLayer(Long id, Model model){
		GoodsClassTag goodsClassTag = GoodsClassTagService.selectByPrimaryKey(id);
		model.addAttribute("goodsClassTag", goodsClassTag);
		return "goods/goodsClassTag/goodsClassTag-save";
	}
	
}
