//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.coupon.service;

import com.zsCat.common.base.BaseService;
import com.zsCat.web.coupon.model.CouponClass;

/**
 * 
 * @author
 */

public interface CouponClassService extends BaseService<CouponClass>{

	

	
	/**
	 * 保存或更新
	 * 
	 * @param CouponClass
	 * @return
	 */
	public int saveCouponClass(CouponClass CouponClass) ;
	/**
	 * 删除
	* @param CouponClass
	* @return
	 */
	public int deleteCouponClass(CouponClass CouponClass);


}
