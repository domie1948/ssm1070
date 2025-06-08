//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.order.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.zsCat.common.base.ServiceMybatis;
import com.zsCat.common.constant.Constant;
import com.zsCat.web.goods.mapper.GoodsClassMapper;
import com.zsCat.web.goods.mapper.GoodsMapper;
import com.zsCat.web.goods.model.Goods;
import com.zsCat.web.goods.model.GoodsClass;
import com.zsCat.web.goods.model.GoodsSpec;
import com.zsCat.web.goods.util.GoodsUtils;
import com.zsCat.web.order.mapper.CartMapper;
import com.zsCat.web.order.model.Cart;
import com.zsCat.web.order.service.CartService;
import com.zsCat.web.sys.utils.SysUserUtils;

/**
 * 
 * @author
 */

@Service("CartService")
public class CartServiceImpl  extends ServiceMybatis<Cart> implements CartService {

	@Resource
	private CartMapper CartMapper;
	@Resource
	private GoodsMapper GoodsMapper;
	@Resource
	private GoodsClassMapper GoodsClassMapper;
	
	/**
	 * 保存或更新
	 * 
	 * @param Cart
	 * @return
	 */
	public int saveCart(Cart Cart) {
		return this.save(Cart);
	}

	/**
	 * 删除
	* @param Cart
	* @return
	 */
	public int deleteCart(Cart Cart) {
		return this.delete(Cart);
	}

	@Override
	public Cart copyGoodsToCart(Long goodsId, Integer specId) {
		Goods goods = GoodsMapper.selectByPrimaryKey(goodsId); //商品信息
        GoodsClass goodsClass = GoodsClassMapper.selectByPrimaryKey(goods.getGcId()); //通过商品分类id查询商品所在分类

		Cart cart = new Cart();
		cart.setGoodsId(goods.getId());
		cart.setMemberId(SysUserUtils.getSessionMemberUser().getId());
		Cart alCart=CartMapper.selectOne(cart);
		if(alCart!=null){
			alCart.setGoodsNum(alCart.getGoodsNum()+1);
			CartMapper.updateByPrimaryKeySelective(alCart);
		}else{
			cart.setGoodsNum(1L);
			cart.setGoodsName(goods.getGoodsName());
			cart.setGoodsStorePrice(goods.getGoodsStorePrice());
			cart.setStoreId(goods.getStoreId());
			cart.setStoreName(Constant.STORE_NAME);
			String[] gcIds = goodsClass.getGcIdpath().split(",");
			cart.setFirstGcId(Long.valueOf(gcIds[0])); //将商品所在分类的一级分类的id存入购物车
			CartMapper.insertSelective(cart);
		}

		return cart;
	}

	@Override
	public List<Cart> selectOwnCart() {
		if(SysUserUtils.getSessionMemberUser()!=null){
			Cart cart=new Cart();
			cart.setMemberId(SysUserUtils.getSessionMemberUser().getId());
			return CartMapper.select(cart);
		}
		return null;
		
	}
	@Override
	public int selectOwnCartCount() {
		if(SysUserUtils.getSessionMemberUser()!=null){
			Cart cart=new Cart();
			cart.setMemberId(SysUserUtils.getSessionMemberUser().getId());
			return CartMapper.selectCount(cart);
		}
		return 0;
		
	}

}
