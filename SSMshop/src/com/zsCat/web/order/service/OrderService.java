//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.order.service;

import com.zsCat.common.base.BaseService;
import com.zsCat.web.order.model.Order;

/**
 * 
 * @author
 */

public interface OrderService extends BaseService<Order>{

	

	
	/**
	 * 保存或更新
	 * 
	 * @param Order
	 * @return
	 */
	public int saveOrder(Order Order) ;
	/**
	 * 删除
	* @param Order
	* @return
	 */
	public int deleteOrder(Order Order);
	public Order insertOrder(String[] cartIds);


}
