//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.base.service;

import com.zsCat.common.base.BaseService;
import com.zsCat.web.base.model.ArticleClass;

/**
 * 
 * @author
 */

public interface ArticleClassService extends BaseService<ArticleClass>{

	

	
	/**
	 * 保存或更新
	 * 
	 * @param ArticleClass
	 * @return
	 */
	public int saveArticleClass(ArticleClass ArticleClass) ;
	/**
	 * 删除
	* @param ArticleClass
	* @return
	 */
	public int deleteArticleClass(ArticleClass ArticleClass);


}
