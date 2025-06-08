/*package com.zsCat.web.sys.controller.front;


import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.zsCat.common.utils.StringUtil;
import com.zsCat.web.blog.model.Blog;
import com.zsCat.web.blog.model.Comment;
import com.zsCat.web.blog.service.CommentService;
import com.zsCat.web.cms.model.CmsArticle;
import com.zsCat.web.cms.model.CmsCategory;
import com.zsCat.web.cms.model.CmsImg;
import com.zsCat.web.cms.service.CmsArticleService;
import com.zsCat.web.cms.service.CmsCategoryService;
import com.zsCat.web.cms.service.CmsImgService;
import com.zsCat.web.gw.model.GwInfo;
import com.zsCat.web.gw.model.Nav;
import com.zsCat.web.gw.model.Product;
import com.zsCat.web.gw.service.GwInfoService;
import com.zsCat.web.gw.service.NavService;
import com.zsCat.web.gw.service.ProductService;
import com.zsCat.web.gw.service.ProductTypeService;
	*//**
	 * 
	 * @author zs 2016-5-5 11:33:51
	 * @Email: 951449465@qq.com
	 * @version 4.0v
	 *	我的blog
	 *//*
@Controller
@RequestMapping("jl")
public class IndexSysController {

	@Resource
	private CmsArticleService CmsArticleService;
	@Resource
	private CmsCategoryService CmsCategoryService;
	@Resource
	private NavService NavService;
	@Resource
	private CmsImgService CmsImgService;
	*//**
	 * 请求主页
	 * @return
	 * @throws Exception
	 *//*
	@RequestMapping("/index")
	public ModelAndView index(@RequestParam(value = "pageNum",required=false,defaultValue="1")Integer pageNum,
			@RequestParam(value = "pageSize",required=false,defaultValue="12")Integer pageSize)throws Exception{
		ModelAndView mav=new ModelAndView();
				
		mav.setViewName("sys/index");
		return mav;
	}
	
	@RequestMapping("/indexj")
	public ModelAndView indexj(@RequestParam(value = "pageNum",required=false,defaultValue="1")Integer pageNum,
			@RequestParam(value = "pageSize",required=false,defaultValue="12")Integer pageSize)throws Exception{
		ModelAndView mav=new ModelAndView();
				
		mav.setViewName("sys/indexj");
		return mav;
	}
	
	@RequestMapping("/indexzt")
	public ModelAndView indexzt(@RequestParam(value = "pageNum",required=false,defaultValue="1")Integer pageNum,
			@RequestParam(value = "pageSize",required=false,defaultValue="12")Integer pageSize)throws Exception{
		ModelAndView mav=new ModelAndView();
				
		mav.setViewName("sys/indexzt");
		return mav;
	}
	
}
*/