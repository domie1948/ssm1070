//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.base.service;

import com.zsCat.common.base.BaseService;
import com.zsCat.web.base.model.Consult;

/**
 * 
 * @author
 */

public interface ConsultService extends BaseService<Consult>{

	

	
	/**
	 * 保存或更新
	 * 
	 * @param Consult
	 * @return
	 */
	public int saveConsult(Consult Consult) ;
	/**
	 * 删除
	* @param Consult
	* @return
	 */
	public int deleteConsult(Consult Consult);


}
