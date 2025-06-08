//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.base.service;

import com.zsCat.common.base.BaseService;
import com.zsCat.web.base.model.Express;

/**
 * 
 * @author
 */

public interface ExpressService extends BaseService<Express>{

	

	
	/**
	 * 保存或更新
	 * 
	 * @param Express
	 * @return
	 */
	public int saveExpress(Express Express) ;
	/**
	 * 删除
	* @param Express
	* @return
	 */
	public int deleteExpress(Express Express);


}
