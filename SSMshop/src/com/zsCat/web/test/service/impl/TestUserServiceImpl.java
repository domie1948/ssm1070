//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.test.service.impl;

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
import com.zsCat.web.test.service.TestUserService;
import com.zsCat.web.test.mapper.TestUserMapper;

import com.zsCat.web.test.model.TestUser;
import com.zsCat.web.sys.model.SysOffice;
import com.zsCat.web.sys.model.SysRole;

/**
 * 
 * @author
 */

@Service("TestUserService")
public class TestUserServiceImpl  extends ServiceMybatis<TestUser> implements TestUserService {

	@Resource
	private TestUserMapper TestUserMapper;

	
	/**
	 * 保存或更新
	 * 
	 * @param TestUser
	 * @return
	 */
	public int saveTestUser(TestUser TestUser) {
		return this.save(TestUser);
	}

	/**
	 * 删除
	* @param TestUser
	* @return
	 */
	public int deleteTestUser(TestUser TestUser) {
		return this.delete(TestUser);
	}


}
