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
import com.zsCat.web.base.service.ConsultService;
import com.zsCat.web.base.mapper.ConsultMapper;

import com.zsCat.web.base.model.Consult;
import com.zsCat.web.sys.model.SysOffice;
import com.zsCat.web.sys.model.SysRole;

/**
 * 
 * @author
 */

@Service("ConsultService")
public class ConsultServiceImpl  extends ServiceMybatis<Consult> implements ConsultService {

	@Resource
	private ConsultMapper ConsultMapper;

	
	/**
	 * 保存或更新
	 * 
	 * @param Consult
	 * @return
	 */
	public int saveConsult(Consult Consult) {
		return this.save(Consult);
	}

	/**
	 * 删除
	* @param Consult
	* @return
	 */
	public int deleteConsult(Consult Consult) {
		return this.delete(Consult);
	}


}
