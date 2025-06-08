//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.goods.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zsCat.common.base.ServiceMybatis;
import com.zsCat.web.base.model.Favorites;
import com.zsCat.web.goods.mapper.GoodsMapper;
import com.zsCat.web.goods.model.Goods;
import com.zsCat.web.goods.service.GoodsService;

/**
 * 
 * @author
 */

@Service("GoodsService")
public class GoodsServiceImpl  extends ServiceMybatis<Goods> implements GoodsService {

	@Resource
	private GoodsMapper GoodsMapper;

	
	/**
	 * 保存或更新
	 * 
	 * @param Goods
	 * @return
	 */
	public int saveGoods(Goods Goods) {
		return this.save(Goods);
	}

	/**
	 * 删除
	* @param Goods
	* @return
	 */
	public int deleteGoods(Goods Goods) {
		return this.delete(Goods);
	}

	@Override
	public PageInfo<Goods> selectFavoritePageInfo(int i, int j, Favorites fa) {
		PageHelper.startPage(i, j);
		return  new PageInfo<Goods>(GoodsMapper.selectFavoritePageInfo(fa));
	}


}
