package com.zsCat.web.test.controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.zsCat.web.test.service.TestUserService;
import com.github.pagehelper.PageInfo;
import com.zsCat.web.test.model.TestUser;
	/**
	 * 
	 * @author zsCat 2016-11-7 19:44:30
	 * @Email: 951449465@qq.com
	 * @version 4.0v
	 *	test管理
	 */
@Controller
@RequestMapping("testUser")
public class TestUserController {

	@Resource
	private TestUserService TestUserService;
	
	@RequestMapping
	public String toTestUser(Model model){
		return "test/testUser/testUser";
	}
	
	/**
	 * 添加或更新区域
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public @ResponseBody Integer save(@ModelAttribute TestUser TestUser) {
		return TestUserService.saveTestUser(TestUser);
	}
	
	/**
	 * 删除字典
	* @param id
	* @return
	 */
	@RequestMapping(value="delete",method=RequestMethod.POST)
	public @ResponseBody Integer del(@ModelAttribute TestUser TestUser){
		return TestUserService.deleteTestUser(TestUser);
	}
	
	/**
	 * 分页显示字典table
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "list", method = RequestMethod.POST)
	public String list(int pageNum,int pageSize,@ModelAttribute TestUser TestUser, Model model) {
		PageInfo<TestUser> page = TestUserService.selectPage(pageNum, pageSize, TestUser);
		model.addAttribute("page", page);
		return "test/testUser/testUser-list";
	}
	
	@RequestMapping(value="{mode}/showlayer",method=RequestMethod.POST)
	public String showLayer(Long id, Model model){
		TestUser testUser = TestUserService.selectByPrimaryKey(id);
		model.addAttribute("testUser", testUser);
		return "test/testUser/testUser-save";
	}
	
}
