package com.zsCat.web.goods.controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.zsCat.web.goods.service.GoodsSpecService;
import com.github.pagehelper.PageInfo;
import com.zsCat.web.goods.model.GoodsSpec;
	/**
	 * 
	 * @author zsCat 2016-10-31 14:08:16
	 * @Email: 951449465@qq.com
	 * @version 4.0v
	 *	商品管理
	 */
@Controller
@RequestMapping("goodsSpec")
public class GoodsSpecController {

	@Resource
	private GoodsSpecService GoodsSpecService;
	
	@RequestMapping
	public String toGoodsSpec(Model model){
		return "goods/goodsSpec/goodsSpec";
	}
	
	/**
	 * 添加或更新区域
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public @ResponseBody Integer save(@ModelAttribute GoodsSpec GoodsSpec) {
		return GoodsSpecService.saveGoodsSpec(GoodsSpec);
	}
	
	/**
	 * 删除字典
	* @param id
	* @return
	 */
	@RequestMapping(value="delete",method=RequestMethod.POST)
	public @ResponseBody Integer del(@ModelAttribute GoodsSpec GoodsSpec){
		return GoodsSpecService.deleteGoodsSpec(GoodsSpec);
	}
	
	/**
	 * 分页显示字典table
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "list", method = RequestMethod.POST)
	public String list(int pageNum,int pageSize,@ModelAttribute GoodsSpec GoodsSpec, Model model) {
		PageInfo<GoodsSpec> page = GoodsSpecService.selectPage(pageNum, pageSize, GoodsSpec);
		model.addAttribute("page", page);
		return "goods/goodsSpec/goodsSpec-list";
	}
	
	@RequestMapping(value="{mode}/showlayer",method=RequestMethod.POST)
	public String showLayer(Long id, Model model){
		GoodsSpec goodsSpec = GoodsSpecService.selectByPrimaryKey(id);
		model.addAttribute("goodsSpec", goodsSpec);
		return "goods/goodsSpec/goodsSpec-save";
	}
	
}
