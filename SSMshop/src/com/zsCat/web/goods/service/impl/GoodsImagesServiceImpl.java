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
import com.zsCat.web.goods.service.GoodsImagesService;
import com.zsCat.web.goods.mapper.GoodsImagesMapper;

import com.zsCat.web.goods.model.GoodsImages;
import com.zsCat.web.sys.model.SysOffice;
import com.zsCat.web.sys.model.SysRole;

/**
 * 
 * @author
 */

@Service("GoodsImagesService")
public class GoodsImagesServiceImpl  extends ServiceMybatis<GoodsImages> implements GoodsImagesService {

	@Resource
	private GoodsImagesMapper GoodsImagesMapper;

	
	/**
	 * 保存或更新
	 * 
	 * @param GoodsImages
	 * @return
	 */
	public int saveGoodsImages(GoodsImages GoodsImages) {
		return this.save(GoodsImages);
	}

	/**
	 * 删除
	* @param GoodsImages
	* @return
	 */
	public int deleteGoodsImages(GoodsImages GoodsImages) {
		return this.delete(GoodsImages);
	}


}
