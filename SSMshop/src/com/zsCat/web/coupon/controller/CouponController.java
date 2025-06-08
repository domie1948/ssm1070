package com.zsCat.web.coupon.controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.zsCat.web.coupon.service.CouponService;
import com.github.pagehelper.PageInfo;
import com.zsCat.web.coupon.model.Coupon;
	/**
	 * 
	 * @author zsCat 2016-11-1 14:45:58
	 * @Email: 951449465@qq.com
	 * @version 4.0v
	 *	优惠劵管理
	 */
@Controller
@RequestMapping("coupon")
public class CouponController {

	@Resource
	private CouponService CouponService;
	
	@RequestMapping
	public String toCoupon(Model model){
		return "coupon/coupon/coupon";
	}
	
	/**
	 * 添加或更新区域
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public @ResponseBody Integer save(@ModelAttribute Coupon Coupon) {
		return CouponService.saveCoupon(Coupon);
	}
	
	/**
	 * 删除字典
	* @param id
	* @return
	 */
	@RequestMapping(value="delete",method=RequestMethod.POST)
	public @ResponseBody Integer del(@ModelAttribute Coupon Coupon){
		return CouponService.deleteCoupon(Coupon);
	}
	
	/**
	 * 分页显示字典table
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "list", method = RequestMethod.POST)
	public String list(int pageNum,int pageSize,@ModelAttribute Coupon Coupon, Model model) {
		PageInfo<Coupon> page = CouponService.selectPage(pageNum, pageSize, Coupon);
		model.addAttribute("page", page);
		return "coupon/coupon/coupon-list";
	}
	
	@RequestMapping(value="{mode}/showlayer",method=RequestMethod.POST)
	public String showLayer(Long id, Model model){
		Coupon coupon = CouponService.selectByPrimaryKey(id);
		model.addAttribute("coupon", coupon);
		return "coupon/coupon/coupon-save";
	}
	
}
