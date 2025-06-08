//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.test.service;

import com.zsCat.common.base.BaseService;
import com.zsCat.web.test.model.TestUser;

/**
 * 
 * @author
 */

public interface TestUserService extends BaseService<TestUser>{

	

	
	/**
	 * 保存或更新
	 * 
	 * @param TestUser
	 * @return
	 */
	public int saveTestUser(TestUser TestUser) ;
	/**
	 * 删除
	* @param TestUser
	* @return
	 */
	public int deleteTestUser(TestUser TestUser);


}
