//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.base.service;

import com.zsCat.common.base.BaseService;
import com.zsCat.web.base.model.Payment;

/**
 * 
 * @author
 */

public interface PaymentService extends BaseService<Payment>{

	

	
	/**
	 * 保存或更新
	 * 
	 * @param Payment
	 * @return
	 */
	public int savePayment(Payment Payment) ;
	/**
	 * 删除
	* @param Payment
	* @return
	 */
	public int deletePayment(Payment Payment);


}
