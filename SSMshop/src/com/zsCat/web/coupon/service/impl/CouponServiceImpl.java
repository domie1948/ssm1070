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
import com.zsCat.web.coupon.service.CouponService;
import com.zsCat.web.coupon.mapper.CouponMapper;

import com.zsCat.web.coupon.model.Coupon;
import com.zsCat.web.sys.model.SysOffice;
import com.zsCat.web.sys.model.SysRole;

/**
 * 
 * @author
 */

@Service("CouponService")
public class CouponServiceImpl  extends ServiceMybatis<Coupon> implements CouponService {

	@Resource
	private CouponMapper CouponMapper;

	
	/**
	 * 保存或更新
	 * 
	 * @param Coupon
	 * @return
	 */
	public int saveCoupon(Coupon Coupon) {
		return this.save(Coupon);
	}

	/**
	 * 删除
	* @param Coupon
	* @return
	 */
	public int deleteCoupon(Coupon Coupon) {
		return this.delete(Coupon);
	}


}
