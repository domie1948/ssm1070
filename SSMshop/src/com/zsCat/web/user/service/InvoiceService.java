//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.user.service;

import com.zsCat.common.base.BaseService;
import com.zsCat.web.user.model.Invoice;

/**
 * 
 * @author
 */

public interface InvoiceService extends BaseService<Invoice>{

	

	
	/**
	 * 保存或更新
	 * 
	 * @param Invoice
	 * @return
	 */
	public int saveInvoice(Invoice Invoice) ;
	/**
	 * 删除
	* @param Invoice
	* @return
	 */
	public int deleteInvoice(Invoice Invoice);


}
