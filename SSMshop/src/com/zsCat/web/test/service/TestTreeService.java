//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.test.service;

import com.zsCat.common.base.BaseService;
import com.zsCat.web.test.model.TestTree;

/**
 * 
 * @author
 */

public interface TestTreeService extends BaseService<TestTree>{

	

	
	/**
	 * 保存或更新
	 * 
	 * @param TestTree
	 * @return
	 */
	public int saveTestTree(TestTree TestTree) ;
	/**
	 * 删除
	* @param TestTree
	* @return
	 */
	public int deleteTestTree(TestTree TestTree);


}
