//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.goods.service.impl;

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
import com.zsCat.web.goods.service.GoodsSpecService;
import com.zsCat.web.goods.mapper.GoodsSpecMapper;

import com.zsCat.web.goods.model.GoodsSpec;
import com.zsCat.web.sys.model.SysOffice;
import com.zsCat.web.sys.model.SysRole;

/**
 * 
 * @author
 */

@Service("GoodsSpecService")
public class GoodsSpecServiceImpl  extends ServiceMybatis<GoodsSpec> implements GoodsSpecService {

	@Resource
	private GoodsSpecMapper GoodsSpecMapper;

	
	/**
	 * 保存或更新
	 * 
	 * @param GoodsSpec
	 * @return
	 */
	public int saveGoodsSpec(GoodsSpec GoodsSpec) {
		return this.save(GoodsSpec);
	}

	/**
	 * 删除
	* @param GoodsSpec
	* @return
	 */
	public int deleteGoodsSpec(GoodsSpec GoodsSpec) {
		return this.delete(GoodsSpec);
	}


}
