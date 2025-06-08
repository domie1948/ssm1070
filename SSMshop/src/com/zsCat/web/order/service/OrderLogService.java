//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.order.service;

import com.zsCat.common.base.BaseService;
import com.zsCat.web.order.model.OrderLog;

/**
 * 
 * @author
 */

public interface OrderLogService extends BaseService<OrderLog>{

	

	
	/**
	 * 保存或更新
	 * 
	 * @param OrderLog
	 * @return
	 */
	public int saveOrderLog(OrderLog OrderLog) ;
	/**
	 * 删除
	* @param OrderLog
	* @return
	 */
	public int deleteOrderLog(OrderLog OrderLog);


}
