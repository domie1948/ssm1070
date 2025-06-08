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
import com.zsCat.web.goods.service.GoodsWordsService;
import com.zsCat.web.goods.mapper.GoodsWordsMapper;

import com.zsCat.web.goods.model.GoodsWords;
import com.zsCat.web.sys.model.SysOffice;
import com.zsCat.web.sys.model.SysRole;

/**
 * 
 * @author
 */

@Service("GoodsWordsService")
public class GoodsWordsServiceImpl  extends ServiceMybatis<GoodsWords> implements GoodsWordsService {

	@Resource
	private GoodsWordsMapper GoodsWordsMapper;

	
	/**
	 * 保存或更新
	 * 
	 * @param GoodsWords
	 * @return
	 */
	public int saveGoodsWords(GoodsWords GoodsWords) {
		return this.save(GoodsWords);
	}

	/**
	 * 删除
	* @param GoodsWords
	* @return
	 */
	public int deleteGoodsWords(GoodsWords GoodsWords) {
		return this.delete(GoodsWords);
	}


}
