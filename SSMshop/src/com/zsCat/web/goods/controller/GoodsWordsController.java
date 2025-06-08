package com.zsCat.web.goods.controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.zsCat.web.goods.service.GoodsWordsService;
import com.github.pagehelper.PageInfo;
import com.zsCat.web.goods.model.GoodsWords;
	/**
	 * 
	 * @author zsCat 2016-10-31 13:49:03
	 * @Email: 951449465@qq.com
	 * @version 4.0v
	 *	商品管理
	 */
@Controller
@RequestMapping("goodsWords")
public class GoodsWordsController {

	@Resource
	private GoodsWordsService GoodsWordsService;
	
	@RequestMapping
	public String toGoodsWords(Model model){
		return "goods/goodsWords/goodsWords";
	}
	
	/**
	 * 添加或更新区域
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public @ResponseBody Integer save(@ModelAttribute GoodsWords GoodsWords) {
		return GoodsWordsService.saveGoodsWords(GoodsWords);
	}
	
	/**
	 * 删除字典
	* @param id
	* @return
	 */
	@RequestMapping(value="delete",method=RequestMethod.POST)
	public @ResponseBody Integer del(@ModelAttribute GoodsWords GoodsWords){
		return GoodsWordsService.deleteGoodsWords(GoodsWords);
	}
	
	/**
	 * 分页显示字典table
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "list", method = RequestMethod.POST)
	public String list(int pageNum,int pageSize,@ModelAttribute GoodsWords GoodsWords, Model model) {
		PageInfo<GoodsWords> page = GoodsWordsService.selectPage(pageNum, pageSize, GoodsWords);
		model.addAttribute("page", page);
		return "goods/goodsWords/goodsWords-list";
	}
	
	@RequestMapping(value="{mode}/showlayer",method=RequestMethod.POST)
	public String showLayer(Long id, Model model){
		GoodsWords goodsWords = GoodsWordsService.selectByPrimaryKey(id);
		model.addAttribute("goodsWords", goodsWords);
		return "goods/goodsWords/goodsWords-save";
	}
	
}
