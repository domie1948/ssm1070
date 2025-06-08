//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.order.service;

import com.zsCat.common.base.BaseService;
import com.zsCat.web.order.model.Brand;

/**
 * 
 * @author
 */

public interface BrandService extends BaseService<Brand>{

	

	
	/**
	 * 保存或更新
	 * 
	 * @param Brand
	 * @return
	 */
	public int saveBrand(Brand Brand) ;
	/**
	 * 删除
	* @param Brand
	* @return
	 */
	public int deleteBrand(Brand Brand);


}
