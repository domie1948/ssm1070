//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.coupon.service.impl;

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
import com.zsCat.web.coupon.service.CouponClassService;
import com.zsCat.web.coupon.mapper.CouponClassMapper;

import com.zsCat.web.coupon.model.CouponClass;
import com.zsCat.web.sys.model.SysOffice;
import com.zsCat.web.sys.model.SysRole;

/**
 * 
 * @author
 */

@Service("CouponClassService")
public class CouponClassServiceImpl  extends ServiceMybatis<CouponClass> implements CouponClassService {

	@Resource
	private CouponClassMapper CouponClassMapper;

	
	/**
	 * 保存或更新
	 * 
	 * @param CouponClass
	 * @return
	 */
	public int saveCouponClass(CouponClass CouponClass) {
		return this.save(CouponClass);
	}

	/**
	 * 删除
	* @param CouponClass
	* @return
	 */
	public int deleteCouponClass(CouponClass CouponClass) {
		return this.delete(CouponClass);
	}


}
