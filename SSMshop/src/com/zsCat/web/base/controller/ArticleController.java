package com.zsCat.web.base.controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.zsCat.web.base.service.ArticleService;
import com.github.pagehelper.PageInfo;
import com.zsCat.web.base.model.Article;
	/**
	 * 
	 * @author zsCat 2016-10-31 20:30:43
	 * @Email: 951449465@qq.com
	 * @version 4.0v
	 *	基础管理
	 */
@Controller
@RequestMapping("article")
public class ArticleController {

	@Resource
	private ArticleService ArticleService;
	
	@RequestMapping
	public String toArticle(Model model){
		return "base/article/article";
	}
	
	/**
	 * 添加或更新区域
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public @ResponseBody Integer save(@ModelAttribute Article Article) {
		return ArticleService.saveArticle(Article);
	}
	
	/**
	 * 删除字典
	* @param id
	* @return
	 */
	@RequestMapping(value="delete",method=RequestMethod.POST)
	public @ResponseBody Integer del(@ModelAttribute Article Article){
		return ArticleService.deleteArticle(Article);
	}
	
	/**
	 * 分页显示字典table
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "list", method = RequestMethod.POST)
	public String list(int pageNum,int pageSize,@ModelAttribute Article Article, Model model) {
		PageInfo<Article> page = ArticleService.selectPage(pageNum, pageSize, Article);
		model.addAttribute("page", page);
		return "base/article/article-list";
	}
	
	@RequestMapping(value="{mode}/showlayer",method=RequestMethod.POST)
	public String showLayer(Long id, Model model){
		Article article = ArticleService.selectByPrimaryKey(id);
		model.addAttribute("article", article);
		return "base/article/article-save";
	}
	
}
