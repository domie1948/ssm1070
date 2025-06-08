//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.order.service;

import com.zsCat.common.base.BaseService;
import com.zsCat.web.order.model.OrderCommon;

/**
 * 
 * @author
 */

public interface OrderCommonService extends BaseService<OrderCommon>{

	

	
	/**
	 * 保存或更新
	 * 
	 * @param OrderCommon
	 * @return
	 */
	public int saveOrderCommon(OrderCommon OrderCommon) ;
	/**
	 * 删除
	* @param OrderCommon
	* @return
	 */
	public int deleteOrderCommon(OrderCommon OrderCommon);


}
