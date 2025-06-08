//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.order.service;

import com.zsCat.common.base.BaseService;
import com.zsCat.web.order.model.OrderInvoice;

/**
 * 
 * @author
 */

public interface OrderInvoiceService extends BaseService<OrderInvoice>{

	

	
	/**
	 * 保存或更新
	 * 
	 * @param OrderInvoice
	 * @return
	 */
	public int saveOrderInvoice(OrderInvoice OrderInvoice) ;
	/**
	 * 删除
	* @param OrderInvoice
	* @return
	 */
	public int deleteOrderInvoice(OrderInvoice OrderInvoice);


}
