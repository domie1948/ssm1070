//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.blog.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Multimap;
import com.google.common.collect.Table;
import com.zsCat.common.base.ServiceMybatis;
import com.zsCat.web.blog.service.BlogTemplateService;
import com.zsCat.web.blog.mapper.BlogTemplateMapper;

import com.zsCat.web.blog.model.BlogTemplate;
import com.zsCat.web.sys.model.SysOffice;
import com.zsCat.web.sys.model.SysRole;

/**
 * 
 * @author
 */

@Service("BlogTemplateService")
public class BlogTemplateServiceImpl  extends ServiceMybatis<BlogTemplate> implements BlogTemplateService {

	@Resource
	private BlogTemplateMapper BlogTemplateMapper;

	
	/**
	 * 保存或更新
	 * 
	 * @param BlogTemplate
	 * @return
	 */
	public int saveBlogTemplate(BlogTemplate BlogTemplate) {
		return this.save(BlogTemplate);
	}

	/**
	 * 删除
	* @param BlogTemplate
	* @return
	 */
	public int deleteBlogTemplate(BlogTemplate BlogTemplate) {
		return this.delete(BlogTemplate);
	}


}
