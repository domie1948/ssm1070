package com.zsCat.web.goods.controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.zsCat.web.goods.service.GoodsClassStapleService;
import com.github.pagehelper.PageInfo;
import com.zsCat.web.goods.model.GoodsClassStaple;
	/**
	 * 
	 * @author zsCat 2016-10-31 14:06:39
	 * @Email: 951449465@qq.com
	 * @version 4.0v
	 *	商品管理
	 */
@Controller
@RequestMapping("goodsClassStaple")
public class GoodsClassStapleController {

	@Resource
	private GoodsClassStapleService GoodsClassStapleService;
	
	@RequestMapping
	public String toGoodsClassStaple(Model model){
		return "goods/goodsClassStaple/goodsClassStaple";
	}
	
	/**
	 * 添加或更新区域
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public @ResponseBody Integer save(@ModelAttribute GoodsClassStaple GoodsClassStaple) {
		return GoodsClassStapleService.saveGoodsClassStaple(GoodsClassStaple);
	}
	
	/**
	 * 删除字典
	* @param id
	* @return
	 */
	@RequestMapping(value="delete",method=RequestMethod.POST)
	public @ResponseBody Integer del(@ModelAttribute GoodsClassStaple GoodsClassStaple){
		return GoodsClassStapleService.deleteGoodsClassStaple(GoodsClassStaple);
	}
	
	/**
	 * 分页显示字典table
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "list", method = RequestMethod.POST)
	public String list(int pageNum,int pageSize,@ModelAttribute GoodsClassStaple GoodsClassStaple, Model model) {
		PageInfo<GoodsClassStaple> page = GoodsClassStapleService.selectPage(pageNum, pageSize, GoodsClassStaple);
		model.addAttribute("page", page);
		return "goods/goodsClassStaple/goodsClassStaple-list";
	}
	
	@RequestMapping(value="{mode}/showlayer",method=RequestMethod.POST)
	public String showLayer(Long id, Model model){
		GoodsClassStaple goodsClassStaple = GoodsClassStapleService.selectByPrimaryKey(id);
		model.addAttribute("goodsClassStaple", goodsClassStaple);
		return "goods/goodsClassStaple/goodsClassStaple-save";
	}
	
}
