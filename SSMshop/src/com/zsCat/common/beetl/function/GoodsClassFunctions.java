package com.zsCat.common.beetl.function;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.zsCat.web.goods.model.Goods;
import com.zsCat.web.goods.model.GoodsClass;
import com.zsCat.web.goods.model.ShopType;
import com.zsCat.web.goods.service.GoodsClassService;
import com.zsCat.web.goods.service.GoodsService;
import com.zsCat.web.goods.service.ShopTypeService;
import com.zsCat.web.order.service.CartService;
import com.zsCat.web.sys.utils.SysUserUtils;

@Component
public class GoodsClassFunctions {
	
	@Resource
	private GoodsClassService goodsClassService;
	@Resource
	private ShopTypeService ShopTypeService;
	@Resource
	private GoodsService GoodsService;
	@Resource
	private CartService CartService;
	public List<GoodsClass> getGoodsClassListByPid(Long pid){
		GoodsClass gc=new GoodsClass();
		gc.setParentId(pid);
		return goodsClassService.select(gc);
	}
	public List<ShopType> getShopTypeListByPid(Long pid){
		ShopType gc=new ShopType();
		gc.setParentId(pid);
		return ShopTypeService.select(gc);
	}
	/**
	 * 根据商品类型查询商品
	 * @param tid
	 * @return
	 */
	public List<Goods> getGoodsListByTypeid(Long tid){
		Goods goods=new Goods();
		goods.setTypeId(tid);
		return GoodsService.selectPage(1, 6, goods).getList();
	}
	
	/**
	 * 根据订单查询商品
	 * @param tid
	 * @return
	 */
//	public List<Goods> getGoodsListByOrderid(Long tid){
//		Goods goods=new Goods();
//		
//		return GoodsService.selectPage(1, 6, goods).getList();
//	}
	/**
	 * 得到购物车数量
	 * @return
	 */
	public int selectOwnCartCount(){
		return CartService.selectOwnCartCount();
	}
}
