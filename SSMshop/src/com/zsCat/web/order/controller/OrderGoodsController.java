package com.zsCat.web.order.controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.zsCat.web.order.service.OrderGoodsService;
import com.github.pagehelper.PageInfo;
import com.zsCat.web.order.model.OrderGoods;
	/**
	 * 
	 * @author zsCat 2016-10-31 20:19:35
	 * @Email: 951449465@qq.com
	 * @version 4.0v
	 *	订单管理
	 */
@Controller
@RequestMapping("orderGoods")
public class OrderGoodsController {

	@Resource
	private OrderGoodsService OrderGoodsService;
	
	@RequestMapping
	public String toOrderGoods(Model model){
		return "order/orderGoods/orderGoods";
	}
	
	/**
	 * 添加或更新区域
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public @ResponseBody Integer save(@ModelAttribute OrderGoods OrderGoods) {
		return OrderGoodsService.saveOrderGoods(OrderGoods);
	}
	
	/**
	 * 删除字典
	* @param id
	* @return
	 */
	@RequestMapping(value="delete",method=RequestMethod.POST)
	public @ResponseBody Integer del(@ModelAttribute OrderGoods OrderGoods){
		return OrderGoodsService.deleteOrderGoods(OrderGoods);
	}
	
	/**
	 * 分页显示字典table
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "list", method = RequestMethod.POST)
	public String list(int pageNum,int pageSize,@ModelAttribute OrderGoods OrderGoods, Model model) {
		PageInfo<OrderGoods> page = OrderGoodsService.selectPage(pageNum, pageSize, OrderGoods);
		model.addAttribute("page", page);
		return "order/orderGoods/orderGoods-list";
	}
	
	@RequestMapping(value="{mode}/showlayer",method=RequestMethod.POST)
	public String showLayer(Long id, Model model){
		OrderGoods orderGoods = OrderGoodsService.selectByPrimaryKey(id);
		model.addAttribute("orderGoods", orderGoods);
		return "order/orderGoods/orderGoods-save";
	}
	
}
