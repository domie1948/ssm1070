package com.zsCat.web.test.controller;


import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.zsCat.web.test.model.TestTree;
import com.zsCat.web.test.service.TestTreeService;
	/**
	 * 
	 * @author zs 2016-5-24 21:52:07
	 * @Email: 951449465@qq.com
	 * @version 4.0v
	 *	我的test
	 */
@Controller
@RequestMapping("testTree")
public class TestTreeController {

	@Resource
	private TestTreeService TestTreeService;
	
	@RequestMapping
	public String toTestTree(Model model) {
		model.addAttribute("treeList", JSON.toJSONString(TestTreeService.select(null)));
		return "test/testTree/testTree";
	}

	/**
	 * 区域树
	 * @return
	 */
	@RequestMapping(value = "tree", method = RequestMethod.POST)
	public @ResponseBody List<TestTree> getTestTreeTreeList() {
		List<TestTree> list = TestTreeService.select(null);
		return list;
	}
	
	/**
	 * 添加或更新区域
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public @ResponseBody Integer save(@ModelAttribute TestTree TestTree,HttpServletRequest request) {
		return TestTreeService.saveTestTree(TestTree);
	}
	
	/**
	 * 删除字典
	* @param id
	* @return
	 */
	@RequestMapping(value="delete",method=RequestMethod.POST)
	public @ResponseBody Integer del(@ModelAttribute TestTree TestTree){
		return TestTreeService.deleteTestTree(TestTree);
	}
	
	/**
	 * 分页显示字典table
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "list", method = RequestMethod.POST)
	public String list(int pageNum,int pageSize,@ModelAttribute TestTree TestTree, Model model) {
		PageInfo<TestTree> page = TestTreeService.selectPage(pageNum, pageSize, TestTree);
		model.addAttribute("page", page);
		return "test/testTree/testTree-list";
	}
	

	@RequestMapping(value = "{mode}/showlayer", method = RequestMethod.POST)
	public String showLayer(Long id, Long parentId,
			@PathVariable("mode") String mode, Model model) {
		TestTree testTree = null, pTestTree = null;
		if (StringUtils.equalsIgnoreCase(mode, "add")) {
			pTestTree = TestTreeService.selectByPrimaryKey(parentId);
		} else if (StringUtils.equalsIgnoreCase(mode, "edit")) {
			testTree = TestTreeService.selectByPrimaryKey(id);
			pTestTree = TestTreeService.selectByPrimaryKey(parentId);
		} else if (StringUtils.equalsIgnoreCase(mode, "detail")) {
			testTree = TestTreeService.selectByPrimaryKey(id);
			pTestTree = TestTreeService.selectByPrimaryKey(testTree.getParentId());
		}
		model.addAttribute("pTestTree", pTestTree).addAttribute("testTree", testTree);
		return mode.equals("detail") ? "test/testTree/testTree-detail"
				: "test/testTree/testTree-save";
	}
	
}
