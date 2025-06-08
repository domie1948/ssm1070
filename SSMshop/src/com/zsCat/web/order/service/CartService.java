//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.order.service;

import java.util.List;

import com.zsCat.common.base.BaseService;
import com.zsCat.web.order.model.Cart;

/**
 * 
 * @author
 */

public interface CartService extends BaseService<Cart>{

	

	
	/**
	 * 保存或更新
	 * 
	 * @param Cart
	 * @return
	 */
	public int saveCart(Cart Cart) ;
	/**
	 * 删除
	* @param Cart
	* @return
	 */
	public int deleteCart(Cart Cart);
	public Cart copyGoodsToCart(Long goodsId, Integer specId);
	public List<Cart> selectOwnCart();
	public int selectOwnCartCount();

}
