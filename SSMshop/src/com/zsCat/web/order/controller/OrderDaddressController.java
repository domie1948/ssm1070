package com.zsCat.web.order.controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.zsCat.web.order.service.OrderDaddressService;
import com.github.pagehelper.PageInfo;
import com.zsCat.web.order.model.OrderDaddress;
	/**
	 * 
	 * @author zsCat 2016-10-31 20:19:18
	 * @Email: 951449465@qq.com
	 * @version 4.0v
	 *	订单管理
	 */
@Controller
@RequestMapping("orderDaddress")
public class OrderDaddressController {

	@Resource
	private OrderDaddressService OrderDaddressService;
	
	@RequestMapping
	public String toOrderDaddress(Model model){
		return "order/orderDaddress/orderDaddress";
	}
	
	/**
	 * 添加或更新区域
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public @ResponseBody Integer save(@ModelAttribute OrderDaddress OrderDaddress) {
		return OrderDaddressService.saveOrderDaddress(OrderDaddress);
	}
	
	/**
	 * 删除字典
	* @param id
	* @return
	 */
	@RequestMapping(value="delete",method=RequestMethod.POST)
	public @ResponseBody Integer del(@ModelAttribute OrderDaddress OrderDaddress){
		return OrderDaddressService.deleteOrderDaddress(OrderDaddress);
	}
	
	/**
	 * 分页显示字典table
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "list", method = RequestMethod.POST)
	public String list(int pageNum,int pageSize,@ModelAttribute OrderDaddress OrderDaddress, Model model) {
		PageInfo<OrderDaddress> page = OrderDaddressService.selectPage(pageNum, pageSize, OrderDaddress);
		model.addAttribute("page", page);
		return "order/orderDaddress/orderDaddress-list";
	}
	
	@RequestMapping(value="{mode}/showlayer",method=RequestMethod.POST)
	public String showLayer(Long id, Model model){
		OrderDaddress orderDaddress = OrderDaddressService.selectByPrimaryKey(id);
		model.addAttribute("orderDaddress", orderDaddress);
		return "order/orderDaddress/orderDaddress-save";
	}
	
}
