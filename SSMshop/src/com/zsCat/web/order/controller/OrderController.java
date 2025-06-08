package com.zsCat.web.order.controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.zsCat.web.order.service.OrderService;
import com.github.pagehelper.PageInfo;
import com.zsCat.web.order.model.Order;
	/**
	 * 
	 * @author zsCat 2016-10-31 20:18:17
	 * @Email: 951449465@qq.com
	 * @version 4.0v
	 *	商品管理
	 */
@Controller
@RequestMapping("order")
public class OrderController {

	@Resource
	private OrderService OrderService;
	
	@RequestMapping
	public String toOrder(Model model){
		return "order/order/order";
	}
	
	/**
	 * 添加或更新区域
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public @ResponseBody Integer save(@ModelAttribute Order Order) {
		return OrderService.saveOrder(Order);
	}
	
	/**
	 * 删除字典
	* @param id
	* @return
	 */
	@RequestMapping(value="delete",method=RequestMethod.POST)
	public @ResponseBody Integer del(@ModelAttribute Order Order){
		return OrderService.deleteOrder(Order);
	}
	
	/**
	 * 分页显示字典table
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "list", method = RequestMethod.POST)
	public String list(int pageNum,int pageSize,@ModelAttribute Order Order, Model model) {
		PageInfo<Order> page = OrderService.selectPage(pageNum, pageSize, Order);
		model.addAttribute("page", page);
		return "order/order/order-list";
	}
	
	@RequestMapping(value="{mode}/showlayer",method=RequestMethod.POST)
	public String showLayer(Long id, Model model){
		Order order = OrderService.selectByPrimaryKey(id);
		model.addAttribute("order", order);
		return "order/order/order-save";
	}
	
}
