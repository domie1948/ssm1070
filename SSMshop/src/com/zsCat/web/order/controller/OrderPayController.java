package com.zsCat.web.order.controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.zsCat.web.order.service.OrderPayService;
import com.github.pagehelper.PageInfo;
import com.zsCat.web.order.model.OrderPay;
	/**
	 * 
	 * @author zsCat 2016-10-31 20:20:23
	 * @Email: 951449465@qq.com
	 * @version 4.0v
	 *	订单管理
	 */
@Controller
@RequestMapping("orderPay")
public class OrderPayController {

	@Resource
	private OrderPayService OrderPayService;
	
	@RequestMapping
	public String toOrderPay(Model model){
		return "order/orderPay/orderPay";
	}
	
	/**
	 * 添加或更新区域
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public @ResponseBody Integer save(@ModelAttribute OrderPay OrderPay) {
		return OrderPayService.saveOrderPay(OrderPay);
	}
	
	/**
	 * 删除字典
	* @param id
	* @return
	 */
	@RequestMapping(value="delete",method=RequestMethod.POST)
	public @ResponseBody Integer del(@ModelAttribute OrderPay OrderPay){
		return OrderPayService.deleteOrderPay(OrderPay);
	}
	
	/**
	 * 分页显示字典table
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "list", method = RequestMethod.POST)
	public String list(int pageNum,int pageSize,@ModelAttribute OrderPay OrderPay, Model model) {
		PageInfo<OrderPay> page = OrderPayService.selectPage(pageNum, pageSize, OrderPay);
		model.addAttribute("page", page);
		return "order/orderPay/orderPay-list";
	}
	
	@RequestMapping(value="{mode}/showlayer",method=RequestMethod.POST)
	public String showLayer(Long id, Model model){
		OrderPay orderPay = OrderPayService.selectByPrimaryKey(id);
		model.addAttribute("orderPay", orderPay);
		return "order/orderPay/orderPay-save";
	}
	
}
