package com.zsCat.web.user.controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.zsCat.web.user.service.MemberService;
import com.github.pagehelper.PageInfo;
import com.zsCat.web.user.model.Member;
	/**
	 * 
	 * @author zsCat 2016-11-1 9:36:30
	 * @Email: 951449465@qq.com
	 * @version 4.0v
	 *	会员管理管理
	 */
@Controller
@RequestMapping("member")
public class MemberController {

	@Resource
	private MemberService MemberService;
	
	@RequestMapping
	public String toMember(Model model){
		return "user/member/member";
	}
	
	/**
	 * 添加或更新区域
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public @ResponseBody Integer save(@ModelAttribute Member Member) {
		return MemberService.saveMember(Member);
	}
	
	/**
	 * 删除字典
	* @param id
	* @return
	 */
	@RequestMapping(value="delete",method=RequestMethod.POST)
	public @ResponseBody Integer del(@ModelAttribute Member Member){
		return MemberService.deleteMember(Member);
	}
	
	/**
	 * 分页显示字典table
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "list", method = RequestMethod.POST)
	public String list(int pageNum,int pageSize,@ModelAttribute Member Member, Model model) {
		PageInfo<Member> page = MemberService.selectPage(pageNum, pageSize, Member);
		model.addAttribute("page", page);
		return "user/member/member-list";
	}
	
	@RequestMapping(value="{mode}/showlayer",method=RequestMethod.POST)
	public String showLayer(Long id, Model model){
		Member member = MemberService.selectByPrimaryKey(id);
		model.addAttribute("member", member);
		return "user/member/member-save";
	}
	
}
