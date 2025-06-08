//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.order.service;

import com.zsCat.common.base.BaseService;
import com.zsCat.web.order.model.OrderGoods;

/**
 * 
 * @author
 */

public interface OrderGoodsService extends BaseService<OrderGoods>{

	

	
	/**
	 * 保存或更新
	 * 
	 * @param OrderGoods
	 * @return
	 */
	public int saveOrderGoods(OrderGoods OrderGoods) ;
	/**
	 * 删除
	* @param OrderGoods
	* @return
	 */
	public int deleteOrderGoods(OrderGoods OrderGoods);


}
