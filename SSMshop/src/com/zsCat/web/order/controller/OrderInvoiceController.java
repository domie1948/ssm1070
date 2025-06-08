package com.zsCat.web.order.controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.zsCat.web.order.service.OrderInvoiceService;
import com.github.pagehelper.PageInfo;
import com.zsCat.web.order.model.OrderInvoice;
	/**
	 * 
	 * @author zsCat 2016-10-31 20:19:52
	 * @Email: 951449465@qq.com
	 * @version 4.0v
	 *	订单管理
	 */
@Controller
@RequestMapping("orderInvoice")
public class OrderInvoiceController {

	@Resource
	private OrderInvoiceService OrderInvoiceService;
	
	@RequestMapping
	public String toOrderInvoice(Model model){
		return "order/orderInvoice/orderInvoice";
	}
	
	/**
	 * 添加或更新区域
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public @ResponseBody Integer save(@ModelAttribute OrderInvoice OrderInvoice) {
		return OrderInvoiceService.saveOrderInvoice(OrderInvoice);
	}
	
	/**
	 * 删除字典
	* @param id
	* @return
	 */
	@RequestMapping(value="delete",method=RequestMethod.POST)
	public @ResponseBody Integer del(@ModelAttribute OrderInvoice OrderInvoice){
		return OrderInvoiceService.deleteOrderInvoice(OrderInvoice);
	}
	
	/**
	 * 分页显示字典table
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "list", method = RequestMethod.POST)
	public String list(int pageNum,int pageSize,@ModelAttribute OrderInvoice OrderInvoice, Model model) {
		PageInfo<OrderInvoice> page = OrderInvoiceService.selectPage(pageNum, pageSize, OrderInvoice);
		model.addAttribute("page", page);
		return "order/orderInvoice/orderInvoice-list";
	}
	
	@RequestMapping(value="{mode}/showlayer",method=RequestMethod.POST)
	public String showLayer(Long id, Model model){
		OrderInvoice orderInvoice = OrderInvoiceService.selectByPrimaryKey(id);
		model.addAttribute("orderInvoice", orderInvoice);
		return "order/orderInvoice/orderInvoice-save";
	}
	
}
