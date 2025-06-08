//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.base.service.impl;

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
import com.zsCat.web.base.service.NavigationService;
import com.zsCat.web.base.mapper.NavigationMapper;

import com.zsCat.web.base.model.Navigation;
import com.zsCat.web.sys.model.SysOffice;
import com.zsCat.web.sys.model.SysRole;

/**
 * 
 * @author
 */

@Service("NavigationService")
public class NavigationServiceImpl  extends ServiceMybatis<Navigation> implements NavigationService {

	@Resource
	private NavigationMapper NavigationMapper;

	
	/**
	 * 保存或更新
	 * 
	 * @param Navigation
	 * @return
	 */
	public int saveNavigation(Navigation Navigation) {
		return this.save(Navigation);
	}

	/**
	 * 删除
	* @param Navigation
	* @return
	 */
	public int deleteNavigation(Navigation Navigation) {
		return this.delete(Navigation);
	}


}
