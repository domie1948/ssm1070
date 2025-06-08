//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.order.service;

import com.zsCat.common.base.BaseService;
import com.zsCat.web.order.model.OrderDaddress;

/**
 * 
 * @author
 */

public interface OrderDaddressService extends BaseService<OrderDaddress>{

	

	
	/**
	 * 保存或更新
	 * 
	 * @param OrderDaddress
	 * @return
	 */
	public int saveOrderDaddress(OrderDaddress OrderDaddress) ;
	/**
	 * 删除
	* @param OrderDaddress
	* @return
	 */
	public int deleteOrderDaddress(OrderDaddress OrderDaddress);


}
