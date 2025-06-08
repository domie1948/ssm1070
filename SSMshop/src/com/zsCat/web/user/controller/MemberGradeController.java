package com.zsCat.web.user.controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.zsCat.web.user.service.MemberGradeService;
import com.github.pagehelper.PageInfo;
import com.zsCat.web.user.model.MemberGrade;
	/**
	 * 
	 * @author zsCat 2016-11-1 9:36:52
	 * @Email: 951449465@qq.com
	 * @version 4.0v
	 *	会员管理管理
	 */
@Controller
@RequestMapping("memberGrade")
public class MemberGradeController {

	@Resource
	private MemberGradeService MemberGradeService;
	
	@RequestMapping
	public String toMemberGrade(Model model){
		return "user/memberGrade/memberGrade";
	}
	
	/**
	 * 添加或更新区域
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public @ResponseBody Integer save(@ModelAttribute MemberGrade MemberGrade) {
		return MemberGradeService.saveMemberGrade(MemberGrade);
	}
	
	/**
	 * 删除字典
	* @param id
	* @return
	 */
	@RequestMapping(value="delete",method=RequestMethod.POST)
	public @ResponseBody Integer del(@ModelAttribute MemberGrade MemberGrade){
		return MemberGradeService.deleteMemberGrade(MemberGrade);
	}
	
	/**
	 * 分页显示字典table
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "list", method = RequestMethod.POST)
	public String list(int pageNum,int pageSize,@ModelAttribute MemberGrade MemberGrade, Model model) {
		PageInfo<MemberGrade> page = MemberGradeService.selectPage(pageNum, pageSize, MemberGrade);
		model.addAttribute("page", page);
		return "user/memberGrade/memberGrade-list";
	}
	
	@RequestMapping(value="{mode}/showlayer",method=RequestMethod.POST)
	public String showLayer(Long id, Model model){
		MemberGrade memberGrade = MemberGradeService.selectByPrimaryKey(id);
		model.addAttribute("memberGrade", memberGrade);
		return "user/memberGrade/memberGrade-save";
	}
	
}
