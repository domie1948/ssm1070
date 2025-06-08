package com.zsCat.web.goods.controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.zsCat.web.goods.service.GoodsService;
import com.github.pagehelper.PageInfo;
import com.zsCat.web.goods.model.Goods;
	/**
	 * 
	 * @author zsCat 2016-10-31 13:59:18
	 * @Email: 951449465@qq.com
	 * @version 4.0v
	 *	商品管理
	 */
@Controller
@RequestMapping("goods")
public class GoodsController {

	@Resource
	private GoodsService GoodsService;
	
	@RequestMapping
	public String toGoods(Model model){
		return "goods/goods/goods";
	}
	
	/**
	 * 添加或更新区域
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public @ResponseBody Integer save(@ModelAttribute Goods Goods) {
		return GoodsService.saveGoods(Goods);
	}
	
	/**
	 * 删除字典
	* @param id
	* @return
	 */
	@RequestMapping(value="delete",method=RequestMethod.POST)
	public @ResponseBody Integer del(@ModelAttribute Goods Goods){
		return GoodsService.deleteGoods(Goods);
	}
	
	/**
	 * 分页显示字典table
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "list", method = RequestMethod.POST)
	public String list(int pageNum,int pageSize,@ModelAttribute Goods Goods, Model model) {
		PageInfo<Goods> page = GoodsService.selectPage(pageNum, pageSize, Goods);
		model.addAttribute("page", page);
		return "goods/goods/goods-list";
	}
	
	@RequestMapping(value="{mode}/showlayer",method=RequestMethod.POST)
	public String showLayer(Long id, Model model){
		Goods goods = GoodsService.selectByPrimaryKey(id);
		model.addAttribute("goods", goods);
		return "goods/goods/goods-save";
	}
	
}
