//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.blog.service;

import com.zsCat.common.base.BaseService;
import com.zsCat.web.blog.model.BlogTemplate;

/**
 * 
 * @author
 */

public interface BlogTemplateService extends BaseService<BlogTemplate>{

	

	
	/**
	 * 保存或更新
	 * 
	 * @param BlogTemplate
	 * @return
	 */
	public int saveBlogTemplate(BlogTemplate BlogTemplate) ;
	/**
	 * 删除
	* @param BlogTemplate
	* @return
	 */
	public int deleteBlogTemplate(BlogTemplate BlogTemplate);


}
