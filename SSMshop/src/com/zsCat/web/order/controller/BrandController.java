package com.zsCat.web.order.controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.zsCat.web.order.service.BrandService;
import com.github.pagehelper.PageInfo;
import com.zsCat.web.order.model.Brand;
	/**
	 * 
	 * @author zsCat 2016-10-31 20:17:59
	 * @Email: 951449465@qq.com
	 * @version 4.0v
	 *	商品管理
	 */
@Controller
@RequestMapping("brand")
public class BrandController {

	@Resource
	private BrandService BrandService;
	
	@RequestMapping
	public String toBrand(Model model){
		return "order/brand/brand";
	}
	
	/**
	 * 添加或更新区域
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public @ResponseBody Integer save(@ModelAttribute Brand Brand) {
		return BrandService.saveBrand(Brand);
	}
	
	/**
	 * 删除字典
	* @param id
	* @return
	 */
	@RequestMapping(value="delete",method=RequestMethod.POST)
	public @ResponseBody Integer del(@ModelAttribute Brand Brand){
		return BrandService.deleteBrand(Brand);
	}
	
	/**
	 * 分页显示字典table
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "list", method = RequestMethod.POST)
	public String list(int pageNum,int pageSize,@ModelAttribute Brand Brand, Model model) {
		PageInfo<Brand> page = BrandService.selectPage(pageNum, pageSize, Brand);
		model.addAttribute("page", page);
		return "order/brand/brand-list";
	}
	
	@RequestMapping(value="{mode}/showlayer",method=RequestMethod.POST)
	public String showLayer(Long id, Model model){
		Brand brand = BrandService.selectByPrimaryKey(id);
		model.addAttribute("brand", brand);
		return "order/brand/brand-save";
	}
	
}
