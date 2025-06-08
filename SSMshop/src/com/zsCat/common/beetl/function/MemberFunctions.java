package com.zsCat.common.beetl.function;

import org.springframework.stereotype.Component;

import com.zsCat.web.sys.utils.SysUserUtils;
import com.zsCat.web.user.model.Member;

@Component
public class MemberFunctions {

	
	/**
	 * 登录用户
	* @return
	 */
	public Member getLoginMember(){
		return SysUserUtils.getSessionMemberUser();
	}
	
	/**
	 * 是否为超级管理员
	* @return
	 */
	public boolean isLogin(){
		return SysUserUtils.getSessionMemberUser()!=null;
	}
	
	
	
}
