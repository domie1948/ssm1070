//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.order.service.impl;

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
import com.zsCat.web.order.service.OrderPayService;
import com.zsCat.web.order.mapper.OrderPayMapper;

import com.zsCat.web.order.model.OrderPay;
import com.zsCat.web.sys.model.SysOffice;
import com.zsCat.web.sys.model.SysRole;

/**
 * 
 * @author
 */

@Service("OrderPayService")
public class OrderPayServiceImpl  extends ServiceMybatis<OrderPay> implements OrderPayService {

	@Resource
	private OrderPayMapper OrderPayMapper;

	
	/**
	 * 保存或更新
	 * 
	 * @param OrderPay
	 * @return
	 */
	public int saveOrderPay(OrderPay OrderPay) {
		return this.save(OrderPay);
	}

	/**
	 * 删除
	* @param OrderPay
	* @return
	 */
	public int deleteOrderPay(OrderPay OrderPay) {
		return this.delete(OrderPay);
	}


}
