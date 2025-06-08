package com.zsCat.web.user.controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.zsCat.web.user.service.InvoiceService;
import com.github.pagehelper.PageInfo;
import com.zsCat.web.user.model.Invoice;
	/**
	 * 
	 * @author zsCat 2016-11-1 9:37:09
	 * @Email: 951449465@qq.com
	 * @version 4.0v
	 *	会员管理管理
	 */
@Controller
@RequestMapping("invoice")
public class InvoiceController {

	@Resource
	private InvoiceService InvoiceService;
	
	@RequestMapping
	public String toInvoice(Model model){
		return "user/invoice/invoice";
	}
	
	/**
	 * 添加或更新区域
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public @ResponseBody Integer save(@ModelAttribute Invoice Invoice) {
		return InvoiceService.saveInvoice(Invoice);
	}
	
	/**
	 * 删除字典
	* @param id
	* @return
	 */
	@RequestMapping(value="delete",method=RequestMethod.POST)
	public @ResponseBody Integer del(@ModelAttribute Invoice Invoice){
		return InvoiceService.deleteInvoice(Invoice);
	}
	
	/**
	 * 分页显示字典table
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "list", method = RequestMethod.POST)
	public String list(int pageNum,int pageSize,@ModelAttribute Invoice Invoice, Model model) {
		PageInfo<Invoice> page = InvoiceService.selectPage(pageNum, pageSize, Invoice);
		model.addAttribute("page", page);
		return "user/invoice/invoice-list";
	}
	
	@RequestMapping(value="{mode}/showlayer",method=RequestMethod.POST)
	public String showLayer(Long id, Model model){
		Invoice invoice = InvoiceService.selectByPrimaryKey(id);
		model.addAttribute("invoice", invoice);
		return "user/invoice/invoice-save";
	}
	
}
