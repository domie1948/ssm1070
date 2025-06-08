//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.order.service;

import com.zsCat.common.base.BaseService;
import com.zsCat.web.order.model.OrderAddress;

/**
 * 
 * @author
 */

public interface OrderAddressService extends BaseService<OrderAddress>{

	

	
	/**
	 * 保存或更新
	 * 
	 * @param OrderAddress
	 * @return
	 */
	public int saveOrderAddress(OrderAddress OrderAddress) ;
	/**
	 * 删除
	* @param OrderAddress
	* @return
	 */
	public int deleteOrderAddress(OrderAddress OrderAddress);


}
