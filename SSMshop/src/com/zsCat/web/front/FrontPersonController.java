package com.zsCat.web.front;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Maps;
import com.zsCat.common.constant.Constant;
import com.zsCat.common.json.JsonUtils;
import com.zsCat.common.redis.RedisUtils;
import com.zsCat.common.redis.bean.RedisGoods;
import com.zsCat.common.utils.IPUtils;
import com.zsCat.web.base.model.Address;
import com.zsCat.web.base.model.Area;
import com.zsCat.web.base.model.Consult;
import com.zsCat.web.base.model.Favorites;
import com.zsCat.web.base.model.Payment;
import com.zsCat.web.base.service.AddressService;
import com.zsCat.web.base.service.AreaService;
import com.zsCat.web.base.service.ConsultService;
import com.zsCat.web.base.service.FavoritesService;
import com.zsCat.web.base.service.PaymentService;
import com.zsCat.web.coupon.model.Coupon;
import com.zsCat.web.coupon.service.CouponService;
import com.zsCat.web.goods.model.Goods;
import com.zsCat.web.goods.service.GoodsClassService;
import com.zsCat.web.goods.service.GoodsService;
import com.zsCat.web.goods.service.ShopTypeService;
import com.zsCat.web.order.model.Cart;
import com.zsCat.web.order.model.Order;
import com.zsCat.web.order.service.CartService;
import com.zsCat.web.order.service.OrderService;
import com.zsCat.web.sys.utils.SysUserUtils;
import com.zsCat.web.user.model.Member;
import com.zsCat.web.user.service.MemberService;
	/**
	 * 
	 * @author zsCat 2016-10-31 14:01:30
	 * @Email: 951449465@qq.com
	 * @version 4.0v
	 *	商品管理
	 */
@Controller
@RequestMapping("/person")
public class FrontPersonController {

	@Resource
	private GoodsClassService GoodsClassService;
	@Resource
	private GoodsService GoodsService;
	@Resource
	private ShopTypeService ShopTypeService;
	@Resource
	private CouponService CouponService;
	@Resource
	private MemberService MemberService;
	@Resource
	private OrderService OrderService;
	@Resource
	private AddressService AddressService;
	@Resource
	private PaymentService PaymentService;
	@Resource
	private ConsultService ConsultService;
	@Resource
	private FavoritesService FavoritesService;
	@Resource
	private AreaService AreaService;
	@Resource
	private CartService CartService;
	 @RequestMapping("")
	  public ModelAndView index() {
	        try {
	            ModelAndView model = new ModelAndView("/mall/person/index");
	            Member member=SysUserUtils.getSessionMemberUser();
	            model.addObject("member", member);
	            //优惠劵
	            Coupon Coupon=new Coupon();
	            Coupon.setCouponLock(0);
	            int conponCount=CouponService.selectCount(Coupon);
	            model.addObject("conponCount", conponCount);
	            
	            return model;
	        } catch (Exception e) {
	            e.printStackTrace();
	            throw new RuntimeException("导航失败!");
	        }
	    }
	 /**
	  * 个人信息
	  * @return
	  */
	 @RequestMapping("/information")
	  public ModelAndView information() {
		 ModelAndView model = new ModelAndView("/mall/person/information");
         Member member=SysUserUtils.getSessionMemberUser();
         model.addObject("member", member);
		 
         Area area=new Area();
		 area.setParentId(1L);
		 List<Area> areas = AreaService.select(area);
		 model.addObject("areas", areas);
		 
		 return model;
	 }
	  /**
	  * 安全管理
	  * @return
	  */
	 @RequestMapping("/safety")
	  public ModelAndView safety() {
		 ModelAndView model = new ModelAndView("/mall/person/safety");
		 
		 
		 return model;
	 }
	 /**
	     * 根据父类ID 获取到 下级城市
	     *
	     * @param @param  parentid
	     * @param @return
	     * @param @throws JsonGenerationException
	     * @param @throws JsonMappingException
	     * @param @throws Exception    设定文件
	     * @return Map<String,String>    返回类型
	     * @throws
	     * @Title: getChildArea
	     * @Description: TODO(这里用一句话描述这个方法的作用)
	     */
	    @RequestMapping(value = "/getChildArea", method = RequestMethod.POST)
	    public
	    @ResponseBody
	    Map<String, String> getChildArea(@RequestParam(value = "id") String parentid) throws JsonGenerationException, JsonMappingException,
	            Exception {
	        Map<String, String> map = Maps.newHashMap();
	        Area area=new Area();
	        area.setParentId(Long.valueOf(parentid));
	        List<Area> areas = AreaService.select(area);
	        String json = "null";
	        String str[]={"areaSort"};
	        if (areas != null && areas.size() > 0) {
	            json = JsonUtils.toJsonStrWithExcludeProperties(areas,str);
	        }
	        map.put("result", json);
	        map.put("success", "true");
	        return map;
	    }
	 /**
	  * 地址管理
	  * @return
	  */
	 @RequestMapping("/address")
	  public ModelAndView address() {
		 ModelAndView model = new ModelAndView("/mall/person/address");
		 List<Address> addressList= AddressService.selectByMemberId();
		 model.addObject("page", addressList);
		 Area area=new Area();
		 area.setParentId(1L);
		 List<Area> areas = AreaService.select(area);
		 model.addObject("areas", areas);
		 return model;
	 }
	 /**
	 *
	 * @Title: saveAddress
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param jsondata
	 * @param @param model
	 * @param @return
	 * @param @throws Exception    设定文件
	 * @return Map<String,Object>    返回类型
	 * @throws
	 */
	@RequestMapping(value = "/saveAddress", method = RequestMethod.POST)
	public String saveAddress(@ModelAttribute Address address) throws Exception {
		address.setIsDefault("0");
		address.setMemberId(SysUserUtils.getSessionMemberUser().getId());
		AddressService.saveAddress(address);
		return "redirect:/person/address";
		
	}
	 /**
		 * 
		 * @Title: updateDef
		 * @Description: 根据收货地址id和用户id修改默认收货地址
		 * @param @param addressId
		 * @param @param model
		 * @param @return
		 * @param @throws Exception 设定文件
		 * @return Map<String,String> 返回类型
		 * @throws
		 */
	 @RequestMapping(value = "/setAddressDef", method = RequestMethod.POST)
		public @ResponseBody
		Map<String, String> updateDef(@RequestParam(value = "addressId") String addressId) throws Exception {

			Map<String, String> map = Maps.newHashMap();
			int result = AddressService.updateDef(addressId, SysUserUtils.getSessionMemberUser().getId().toString());
			if(result == 1){
				map.put("success", "true");
			}else{
				map.put("success", "false");
			}
			return map;
		}
	 /**
	  * 快捷支付
	  * @return
	  */
	 @RequestMapping("/cardlist")
	  public ModelAndView cardlist() {
		 ModelAndView model = new ModelAndView("/mall/person/cardlist");
		 Payment Payment=new Payment();
		 Payment.setIsDel(1);
		 List<Payment> payList=PaymentService.select(Payment);
		 model.addObject("page", payList);
		 return model;
	 }
	 /**
	  * 添加银行卡
	  * @return
	  */
	 @RequestMapping("/cardmethod")
	  public ModelAndView cardmethod() {
		 ModelAndView model = new ModelAndView("/mall/person/cardmethod");
		 Payment Payment=new Payment();
		 Payment.setIsDel(1);
		 List<Payment> payList=PaymentService.select(Payment);
		 model.addObject("page", payList);
		 return model;
	 }
	 // return "redirect:/front";
	 
	 /**
	  * 订单管理
	  * @return
	  */
	 @RequestMapping("/order/{orderStats}")
	  public ModelAndView order(@RequestParam(value = "orderStats",required=false,defaultValue="10") Integer orderStats) {
		 ModelAndView model = new ModelAndView("/mall/person/order");
		 Order order=new Order();
		 //所有订单
		 PageInfo<Order> orderList=OrderService.selectPage(1, 40, order);
		 model.addObject("page", orderList);
		 //待付款
		 order.setOrderState(10);
		 PageInfo<Order> orderList1=OrderService.selectPage(1, 40, order);
		 model.addObject("page1", orderList1);
		 //代发货
		 order.setOrderState(20);
		 PageInfo<Order> orderList2=OrderService.selectPage(1, 40, order);
		 model.addObject("page2", orderList2);
		 //待收货
		 order.setOrderState(30);
		 PageInfo<Order> orderList3=OrderService.selectPage(1, 40, order);
		 model.addObject("page3", orderList3);
		 //待评价
		 order.setOrderState(40);
		 PageInfo<Order> orderList4=OrderService.selectPage(1, 40, order);
		 model.addObject("page4", orderList4);
		//已取消
		 order.setOrderState(99);
		 PageInfo<Order> orderList5=OrderService.selectPage(1, 40, order);
		 model.addObject("page5", orderList5);
		 
		 return model;
	 }
	 /**
	  * 退款管理
	  * @return
	  */
	 @RequestMapping("/change")
	  public ModelAndView change() {
		 ModelAndView model = new ModelAndView("/mall/person/change");
		 
		 
		 return model;
	 }
	 /**
	  * 评价管理
	  * @return
	  */
	 @RequestMapping("/comment")
	  public ModelAndView comment() {
		 ModelAndView model = new ModelAndView("/mall/person/comment");
		 Consult Consult=new Consult();
		 PageInfo<Consult> page=ConsultService.selectPage(1, 40, Consult);
		 model.addObject("page", page);
		 return model;
	 }
	 /**
	  * 我的积分
	  * @return
	  */
	 @RequestMapping("/points")
	  public ModelAndView points() {
		 ModelAndView model = new ModelAndView("/mall/person/points");
		 
		 
		 return model;
	 }
	 
	 /**
	  * 优惠劵
	  * @return
	  */
	 @RequestMapping("/coupon")
	  public ModelAndView coupon() {
		 ModelAndView model = new ModelAndView("/mall/person/coupon");
		 
		 
		 return model;
	 }
	 /**
	  * 红包
	  * @return
	  */
	 @RequestMapping("/bonus")
	  public ModelAndView bonus() {
		 ModelAndView model = new ModelAndView("/mall/person/bonus");
		 
		 
		 return model;
	 }
	 /**
	  * 账户余额
	  * @return
	  */
	 @RequestMapping("/walletlist")
	  public ModelAndView walletlist() {
		 ModelAndView model = new ModelAndView("/mall/person/walletlist");
		 
		 
		 return model;
	 }
	 /**
	  * 账单明细
	  * @return
	  */
	 @RequestMapping("/bill")
	  public ModelAndView bill() {
		 ModelAndView model = new ModelAndView("/mall/person/bill");
		 
		 
		 return model;
	 }
	 /**
	  * 收藏
	  * @return
	  */
	 @RequestMapping("/collection")
	  public ModelAndView collection() {
		 ModelAndView model = new ModelAndView("/mall/person/collection");
		 Favorites fa=new Favorites();
		 fa.setMemberId(SysUserUtils.getSessionMemberUser().getId());
		 PageInfo<Goods> page= GoodsService.selectFavoritePageInfo(1, 30, fa);
		 model.addObject("page", page);
		 return model;
	 }
	 /**
	  * 足迹
	  * @return
	  */
	 @RequestMapping("/foot")
	  public ModelAndView foot(HttpServletRequest req) {
		 ModelAndView model = new ModelAndView("/mall/person/foot");
		  String ip=IPUtils.getClientAddress(req);
		    RedisUtils  RedisUtils=new RedisUtils();
			Map<String,String> map=RedisUtils.hgetall(Constant.SHOPPING_HISTORY+ip);
			List<String> l=JsonUtils.testMap2List(map);
			List<RedisGoods> goodsList=new ArrayList<RedisGoods>();
			for (int i=0;i<l.size();i++){
				String json=l.get(i);
				goodsList.add(JsonUtils.fromJson(json, RedisGoods.class));
			}
			model.addObject("goodsList",goodsList);
		 return model;
	 }
	 /**
	  * 商品咨询
	  * @return
	  */
	 @RequestMapping("/consultation")
	  public ModelAndView consultation() {
		 ModelAndView model = new ModelAndView("/mall/person/consultation");
		 
		 
		 return model;
	 }
	 /**
	  * 意见反馈
	  * @return
	  */
	 @RequestMapping("/suggest")
	  public ModelAndView suggest() {
		 ModelAndView model = new ModelAndView("/mall/person/suggest");
		 
		 
		 return model;
	 }
	 /**
	  * 我的消息
	  * @return
	  */
	 @RequestMapping("/news")
	  public ModelAndView news() {
		 ModelAndView model = new ModelAndView("/mall/person/news");
		 
		 
		 return model;
	 }
	
	 @RequestMapping("/cartList")
	  public ModelAndView cartList() {
		 ModelAndView model = new ModelAndView("/mall/cartList");
		 List<Cart> cartList=CartService.selectOwnCart();
		 model.addObject("cartList", cartList);
		 return model;
	 }
	 /**
	  * 立即购买
	  * @param id
	  * @return
	  * @throws Exception
	  */
	 @RequestMapping("/LikBuy/{goodsId}")
		public ModelAndView goodsDetail(@PathVariable("goodsId") Long goodsId,
				 HttpSession session)throws Exception{
			ModelAndView mav=new ModelAndView();
			CartService.copyGoodsToCart(goodsId, 1);
			Cart cart = new Cart();
			cart.setMemberId(SysUserUtils.getSessionMemberUser().getId());
			List<Cart> cartList=CartService.select(cart);
			mav.addObject("cartList", cartList);
			
			 List<Address> addressList= AddressService.selectByMemberId();
			 mav.addObject("addressList", addressList);
			 
			 Payment Payment=new Payment();
			 Payment.setIsDel(1);
			 List<Payment> payList=PaymentService.select(Payment);
			 mav.addObject("payList", payList);
			 
			mav.setViewName("mall/LikBuy");
			return mav;
		}
	 /**
	  * 提交订单
	  * @param id
	  * @return
	  * @throws Exception
	  */
	 @RequestMapping("submitOrder")
		public ModelAndView submitOrder(@RequestParam(value = "cartIds") String[] cartIds)throws Exception{
			ModelAndView mav=new ModelAndView();
			Order order=OrderService.insertOrder(cartIds);
			mav.setViewName("mall/success");
			mav.addObject("order", order);
			return mav;
		}
	 /**
	  * 查看已买到的宝贝
	  * @param id
	  * @return
	  * @throws Exception
	  */
	 @RequestMapping("/selledGoods/{id}")
		public ModelAndView selledGoods(@PathVariable("id") Long id)throws Exception{
			ModelAndView mav=new ModelAndView();
			Goods b=GoodsService.selectByPrimaryKey(id);
			mav.addObject("goods", b);
			mav.setViewName("mall/person/order");
			return mav;
		}
	 /**
	  *交易详情
	  * @param id
	  * @return
	  * @throws Exception
	  */
	 @RequestMapping("/orderDetail/{id}")
		public ModelAndView orderDetail(@PathVariable("id") Long id)throws Exception{
			ModelAndView mav=new ModelAndView();
			Goods b=GoodsService.selectByPrimaryKey(id);
			mav.addObject("goods", b);
			mav.setViewName("mall/person/orderinfo");
			return mav;
		}
}
