//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.base.service;

import com.zsCat.common.base.BaseService;
import com.zsCat.web.base.model.Article;

/**
 * 
 * @author
 */

public interface ArticleService extends BaseService<Article>{

	

	
	/**
	 * 保存或更新
	 * 
	 * @param Article
	 * @return
	 */
	public int saveArticle(Article Article) ;
	/**
	 * 删除
	* @param Article
	* @return
	 */
	public int deleteArticle(Article Article);


}
