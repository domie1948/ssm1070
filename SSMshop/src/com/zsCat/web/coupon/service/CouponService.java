//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.coupon.service;

import com.zsCat.common.base.BaseService;
import com.zsCat.web.coupon.model.Coupon;

/**
 * 
 * @author
 */

public interface CouponService extends BaseService<Coupon>{

	

	
	/**
	 * 保存或更新
	 * 
	 * @param Coupon
	 * @return
	 */
	public int saveCoupon(Coupon Coupon) ;
	/**
	 * 删除
	* @param Coupon
	* @return
	 */
	public int deleteCoupon(Coupon Coupon);


}
