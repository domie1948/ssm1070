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
import com.zsCat.web.base.service.AdvService;
import com.zsCat.web.base.mapper.AdvMapper;

import com.zsCat.web.base.model.Adv;
import com.zsCat.web.sys.model.SysOffice;
import com.zsCat.web.sys.model.SysRole;

/**
 * 
 * @author
 */

@Service("AdvService")
public class AdvServiceImpl  extends ServiceMybatis<Adv> implements AdvService {

	@Resource
	private AdvMapper AdvMapper;

	
	/**
	 * 保存或更新
	 * 
	 * @param Adv
	 * @return
	 */
	public int saveAdv(Adv Adv) {
		return this.save(Adv);
	}

	/**
	 * 删除
	* @param Adv
	* @return
	 */
	public int deleteAdv(Adv Adv) {
		return this.delete(Adv);
	}


}
