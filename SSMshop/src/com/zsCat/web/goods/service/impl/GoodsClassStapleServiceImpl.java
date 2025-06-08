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
import com.zsCat.web.goods.service.GoodsClassStapleService;
import com.zsCat.web.goods.mapper.GoodsClassStapleMapper;

import com.zsCat.web.goods.model.GoodsClassStaple;
import com.zsCat.web.sys.model.SysOffice;
import com.zsCat.web.sys.model.SysRole;

/**
 * 
 * @author
 */

@Service("GoodsClassStapleService")
public class GoodsClassStapleServiceImpl  extends ServiceMybatis<GoodsClassStaple> implements GoodsClassStapleService {

	@Resource
	private GoodsClassStapleMapper GoodsClassStapleMapper;

	
	/**
	 * 保存或更新
	 * 
	 * @param GoodsClassStaple
	 * @return
	 */
	public int saveGoodsClassStaple(GoodsClassStaple GoodsClassStaple) {
		return this.save(GoodsClassStaple);
	}

	/**
	 * 删除
	* @param GoodsClassStaple
	* @return
	 */
	public int deleteGoodsClassStaple(GoodsClassStaple GoodsClassStaple) {
		return this.delete(GoodsClassStaple);
	}


}
