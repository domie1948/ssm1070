package com.zsCat.web.order.controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.zsCat.web.order.service.OrderAddressService;
import com.github.pagehelper.PageInfo;
import com.zsCat.web.order.model.OrderAddress;
	/**
	 * 
	 * @author zsCat 2016-10-31 20:18:32
	 * @Email: 951449465@qq.com
	 * @version 4.0v
	 *	商品管理
	 */
@Controller
@RequestMapping("orderAddress")
public class OrderAddressController {

	@Resource
	private OrderAddressService OrderAddressService;
	
	@RequestMapping
	public String toOrderAddress(Model model){
		return "order/orderAddress/orderAddress";
	}
	
	/**
	 * 添加或更新区域
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public @ResponseBody Integer save(@ModelAttribute OrderAddress OrderAddress) {
		return OrderAddressService.saveOrderAddress(OrderAddress);
	}
	
	/**
	 * 删除字典
	* @param id
	* @return
	 */
	@RequestMapping(value="delete",method=RequestMethod.POST)
	public @ResponseBody Integer del(@ModelAttribute OrderAddress OrderAddress){
		return OrderAddressService.deleteOrderAddress(OrderAddress);
	}
	
	/**
	 * 分页显示字典table
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "list", method = RequestMethod.POST)
	public String list(int pageNum,int pageSize,@ModelAttribute OrderAddress OrderAddress, Model model) {
		PageInfo<OrderAddress> page = OrderAddressService.selectPage(pageNum, pageSize, OrderAddress);
		model.addAttribute("page", page);
		return "order/orderAddress/orderAddress-list";
	}
	
	@RequestMapping(value="{mode}/showlayer",method=RequestMethod.POST)
	public String showLayer(Long id, Model model){
		OrderAddress orderAddress = OrderAddressService.selectByPrimaryKey(id);
		model.addAttribute("orderAddress", orderAddress);
		return "order/orderAddress/orderAddress-save";
	}
	
}
