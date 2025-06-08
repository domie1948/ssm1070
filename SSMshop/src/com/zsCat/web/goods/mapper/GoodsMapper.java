//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.goods.mapper;

import java.util.List;

import com.github.abel533.mapper.Mapper;
import com.github.pagehelper.PageInfo;
import com.zsCat.web.base.model.Favorites;
import com.zsCat.web.goods.model.Goods;
import com.zsCat.web.sys.model.SysResource;


/**
 * 
 * @author zsCat 2016-10-31 14:05:53
 * @Email: 951449465@qq.com
 * @version 4.0v
 *	商品管理
 */
public interface GoodsMapper extends Mapper<Goods>{

	List<Goods> selectFavoritePageInfo(Favorites fa);

}
