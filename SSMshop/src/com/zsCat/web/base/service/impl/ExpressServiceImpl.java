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
import com.zsCat.web.base.service.ExpressService;
import com.zsCat.web.base.mapper.ExpressMapper;

import com.zsCat.web.base.model.Express;
import com.zsCat.web.sys.model.SysOffice;
import com.zsCat.web.sys.model.SysRole;

/**
 * 
 * @author
 */

@Service("ExpressService")
public class ExpressServiceImpl  extends ServiceMybatis<Express> implements ExpressService {

	@Resource
	private ExpressMapper ExpressMapper;

	
	/**
	 * 保存或更新
	 * 
	 * @param Express
	 * @return
	 */
	public int saveExpress(Express Express) {
		return this.save(Express);
	}

	/**
	 * 删除
	* @param Express
	* @return
	 */
	public int deleteExpress(Express Express) {
		return this.delete(Express);
	}


}
