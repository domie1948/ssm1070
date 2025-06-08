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
import com.zsCat.web.order.service.OrderAddressService;
import com.zsCat.web.order.mapper.OrderAddressMapper;

import com.zsCat.web.order.model.OrderAddress;
import com.zsCat.web.sys.model.SysOffice;
import com.zsCat.web.sys.model.SysRole;

/**
 * 
 * @author
 */

@Service("OrderAddressService")
public class OrderAddressServiceImpl  extends ServiceMybatis<OrderAddress> implements OrderAddressService {

	@Resource
	private OrderAddressMapper OrderAddressMapper;

	
	/**
	 * 保存或更新
	 * 
	 * @param OrderAddress
	 * @return
	 */
	public int saveOrderAddress(OrderAddress OrderAddress) {
		return this.save(OrderAddress);
	}

	/**
	 * 删除
	* @param OrderAddress
	* @return
	 */
	public int deleteOrderAddress(OrderAddress OrderAddress) {
		return this.delete(OrderAddress);
	}


}
