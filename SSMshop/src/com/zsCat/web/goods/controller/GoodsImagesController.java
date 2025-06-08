package com.zsCat.web.goods.controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.zsCat.web.goods.service.GoodsImagesService;
import com.github.pagehelper.PageInfo;
import com.zsCat.web.goods.model.GoodsImages;
	/**
	 * 
	 * @author zsCat 2016-10-31 14:07:57
	 * @Email: 951449465@qq.com
	 * @version 4.0v
	 *	商品管理
	 */
@Controller
@RequestMapping("goodsImages")
public class GoodsImagesController {

	@Resource
	private GoodsImagesService GoodsImagesService;
	
	@RequestMapping
	public String toGoodsImages(Model model){
		return "goods/goodsImages/goodsImages";
	}
	
	/**
	 * 添加或更新区域
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public @ResponseBody Integer save(@ModelAttribute GoodsImages GoodsImages) {
		return GoodsImagesService.saveGoodsImages(GoodsImages);
	}
	
	/**
	 * 删除字典
	* @param id
	* @return
	 */
	@RequestMapping(value="delete",method=RequestMethod.POST)
	public @ResponseBody Integer del(@ModelAttribute GoodsImages GoodsImages){
		return GoodsImagesService.deleteGoodsImages(GoodsImages);
	}
	
	/**
	 * 分页显示字典table
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "list", method = RequestMethod.POST)
	public String list(int pageNum,int pageSize,@ModelAttribute GoodsImages GoodsImages, Model model) {
		PageInfo<GoodsImages> page = GoodsImagesService.selectPage(pageNum, pageSize, GoodsImages);
		model.addAttribute("page", page);
		return "goods/goodsImages/goodsImages-list";
	}
	
	@RequestMapping(value="{mode}/showlayer",method=RequestMethod.POST)
	public String showLayer(Long id, Model model){
		GoodsImages goodsImages = GoodsImagesService.selectByPrimaryKey(id);
		model.addAttribute("goodsImages", goodsImages);
		return "goods/goodsImages/goodsImages-save";
	}
	
}
