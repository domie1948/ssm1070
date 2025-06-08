package com.zsCat.web.front;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.zsCat.common.constant.Constant;
import com.zsCat.common.utils.PasswordEncoder;
import com.zsCat.web.base.service.AddressService;
import com.zsCat.web.base.service.AreaService;
import com.zsCat.web.base.service.ConsultService;
import com.zsCat.web.base.service.FavoritesService;
import com.zsCat.web.base.service.PaymentService;
import com.zsCat.web.coupon.service.CouponService;
import com.zsCat.web.goods.model.Goods;
import com.zsCat.web.goods.model.GoodsClass;
import com.zsCat.web.goods.model.ShopType;
import com.zsCat.web.goods.service.GoodsClassService;
import com.zsCat.web.goods.service.GoodsService;
import com.zsCat.web.goods.service.ShopTypeService;
import com.zsCat.web.order.model.Cart;
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
@RequestMapping("/front")
public class FrontIndexController {

	@Resource
	private GoodsClassService GoodsClassService;
	@Resource
	private GoodsService GoodsService;
	@Resource
	private ShopTypeService ShopTypeService;
	
	@Resource
	private MemberService MemberService;

	@Resource
	private CouponService CouponService;

	@Resource
	private OrderService OrderService;
	@Resource
	private AddressService AddressService;
	@Resource
	private PaymentService PaymentService;
	@Resource
	private ConsultService ConsultService;
	
	@Resource
	private CartService CartService;
	@Resource
	private AreaService AreaService;
	@Resource
	private FavoritesService FavoritesService;
	 @RequestMapping("")
	  public ModelAndView index() {
	        try {
	            ModelAndView model = new ModelAndView("/mall/home2");
	            Goods goods=new Goods();
	            PageInfo<Goods> page = GoodsService.selectPage(1, 4, goods);
	            model.addObject("page", page);
	            GoodsClass gc=new GoodsClass();
	            gc.setParentId(1L);
	            List<GoodsClass> gcList=GoodsClassService.selectPage(1, 15, gc).getList();
	            ShopType sp=new ShopType();
	            sp.setParentId(1L);
	            List<ShopType> spList=ShopTypeService.selectPage(1, 9, sp).getList();
	            model.addObject("spList", spList);
	            model.addObject("gcList", gcList);
	            return model;
	        } catch (Exception e) {
	            e.printStackTrace();
	            throw new RuntimeException("导航失败!");
	        }
	    }

	   /**
		 * 跳转到登录页面
		 * 
		 * @return
		 */
		@RequestMapping(value = "login", method = RequestMethod.GET)
		public String toLogin() {
			if( SysUserUtils.getSessionMemberUser() != null){
				return "redirect:/front";
			}
			return "/mall/login";
		}
		
		/**
		 * 登录验证
		 * 
		 * @param username
		 * @param password
		 * @param code
		 * @return
		 */
		@RequestMapping(value = "login", method = RequestMethod.POST)
		public @ResponseBody Map<String, Object> checkLogin(String username,
				String password,  HttpServletRequest request) {

			Map<String, Object> msg = new HashMap<String, Object>();
			HttpSession session = request.getSession();
			//code = StringUtils.trim(code);
			username = StringUtils.trim(username);
			password = StringUtils.trim(password);
			//Object scode = session.getAttribute("code");
			String sessionCode = null;
//			if (scode != null)
//				sessionCode = scode.toString();
//			if (!StringUtils.equalsIgnoreCase(code, sessionCode)) {
//				msg.put("error", "验证码错误");
//				return msg;
//			}
			Member user = MemberService.checkMember(username, password);
			if (null != user) {
				session.setAttribute(Constant.SESSION_Member_USER, user);
			} else {
				msg.put("error", "用户名或密码错误");
			}
			return msg;
		}
	 
		 /**
		 * 跳转到登录页面
		 * 
		 * @return
		 */
		@RequestMapping(value = "reg", method = RequestMethod.GET)
		public String reg() {
			if( SysUserUtils.getSessionMemberUser() != null){
				return "redirect:/front";
			}
			return "/mall/register";
		}
	
		@RequestMapping(value = "reg", method = RequestMethod.POST)
		public @ResponseBody Map<String, Object> reg(
				@RequestParam(value = "password",required=true)String  password,
				@RequestParam(value = "email",required=false)String email,
				@RequestParam(value = "phone",required=false)String phone,
				@RequestParam(value = "passwordRepeat",required=true)String passwordRepeat,HttpServletRequest request) {
			Map<String, Object> msg = new HashMap<String, Object>();
			if (!StringUtils.equalsIgnoreCase(password, passwordRepeat)) {
				msg.put("error", "密码不一致!");
				return msg;
			}
			String secPwd = null ;
			Member m=new Member();
			if(StringUtils.isNoneBlank(email)){
				m.setMemberEmail(email);
				m.setMemberName(email);
				secPwd = PasswordEncoder.encrypt(password, email);
			}
			if(StringUtils.isNoneBlank(phone)){
				secPwd = PasswordEncoder.encrypt(password, phone);
				m.setMemberMobile(phone);
				m.setMemberName(email);
			}
			m.setMemberPasswd(secPwd);
			try {
				int result = MemberService.insertSelective(m);
				HttpSession session = request.getSession();
				if (result>0) {
					session.setAttribute(Constant.SESSION_Member_USER, m);
				} else {
					msg.put("error", "注册失败");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return msg;
		}
	 	/**
		 * 用户退出
		 * 
		 * @return 跳转到登录页面
		 */
		@RequestMapping("logout")
		public String logout(HttpServletRequest request) {
			request.getSession().invalidate();
			return "redirect:/front/login";
		}
	
		@RequestMapping("/search")
	  public ModelAndView search() {
		 ModelAndView model = new ModelAndView("/mall/search");
		 
		 
		 return model;
	 }
	
	 
}
