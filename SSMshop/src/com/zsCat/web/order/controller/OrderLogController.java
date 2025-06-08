package com.zsCat.web.order.controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.zsCat.web.order.service.OrderLogService;
import com.github.pagehelper.PageInfo;
import com.zsCat.web.order.model.OrderLog;
	/**
	 * 
	 * @author zsCat 2016-10-31 20:20:08
	 * @Email: 951449465@qq.com
	 * @version 4.0v
	 *	订单管理
	 */
@Controller
@RequestMapping("orderLog")
public class OrderLogController {

	@Resource
	private OrderLogService OrderLogService;
	
	@RequestMapping
	public String toOrderLog(Model model){
		return "order/orderLog/orderLog";
	}
	
	/**
	 * 添加或更新区域
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public @ResponseBody Integer save(@ModelAttribute OrderLog OrderLog) {
		return OrderLogService.saveOrderLog(OrderLog);
	}
	
	/**
	 * 删除字典
	* @param id
	* @return
	 */
	@RequestMapping(value="delete",method=RequestMethod.POST)
	public @ResponseBody Integer del(@ModelAttribute OrderLog OrderLog){
		return OrderLogService.deleteOrderLog(OrderLog);
	}
	
	/**
	 * 分页显示字典table
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "list", method = RequestMethod.POST)
	public String list(int pageNum,int pageSize,@ModelAttribute OrderLog OrderLog, Model model) {
		PageInfo<OrderLog> page = OrderLogService.selectPage(pageNum, pageSize, OrderLog);
		model.addAttribute("page", page);
		return "order/orderLog/orderLog-list";
	}
	
	@RequestMapping(value="{mode}/showlayer",method=RequestMethod.POST)
	public String showLayer(Long id, Model model){
		OrderLog orderLog = OrderLogService.selectByPrimaryKey(id);
		model.addAttribute("orderLog", orderLog);
		return "order/orderLog/orderLog-save";
	}
	
}
