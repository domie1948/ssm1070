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
import com.zsCat.web.base.service.PaymentService;
import com.zsCat.web.base.mapper.PaymentMapper;

import com.zsCat.web.base.model.Payment;
import com.zsCat.web.sys.model.SysOffice;
import com.zsCat.web.sys.model.SysRole;

/**
 * 
 * @author
 */

@Service("PaymentService")
public class PaymentServiceImpl  extends ServiceMybatis<Payment> implements PaymentService {

	@Resource
	private PaymentMapper PaymentMapper;

	
	/**
	 * 保存或更新
	 * 
	 * @param Payment
	 * @return
	 */
	public int savePayment(Payment Payment) {
		return this.save(Payment);
	}

	/**
	 * 删除
	* @param Payment
	* @return
	 */
	public int deletePayment(Payment Payment) {
		return this.delete(Payment);
	}


}
