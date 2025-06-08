//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.order.service;

import com.zsCat.common.base.BaseService;
import com.zsCat.web.order.model.OrderPay;

/**
 * 
 * @author
 */

public interface OrderPayService extends BaseService<OrderPay>{

	

	
	/**
	 * 保存或更新
	 * 
	 * @param OrderPay
	 * @return
	 */
	public int saveOrderPay(OrderPay OrderPay) ;
	/**
	 * 删除
	* @param OrderPay
	* @return
	 */
	public int deleteOrderPay(OrderPay OrderPay);


}
