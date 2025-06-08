//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.user.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Multimap;
import com.google.common.collect.Table;
import com.zsCat.common.base.ServiceMybatis;
import com.zsCat.common.utils.PasswordEncoder;
import com.zsCat.web.user.service.MemberService;
import com.zsCat.web.user.mapper.MemberMapper;
import com.zsCat.web.user.model.Member;
import com.zsCat.web.sys.model.SysOffice;
import com.zsCat.web.sys.model.SysRole;
import com.zsCat.web.sys.model.SysUser;

/**
 * 
 * @author
 */

@Service("MemberService")
public class MemberServiceImpl  extends ServiceMybatis<Member> implements MemberService {

	@Resource
	private MemberMapper MemberMapper;

	
	/**
	 * 保存或更新
	 * 
	 * @param Member
	 * @return
	 */
	public int saveMember(Member Member) {
		return this.save(Member);
	}

	/**
	 * 删除
	* @param Member
	* @return
	 */
	public int deleteMember(Member Member) {
		return this.delete(Member);
	}

	@Override
	public Member checkMember(String username, String password) {
		Member sysUser = new Member();
		String secPwd = PasswordEncoder.encrypt(password, username);
		sysUser.setMemberName(username);
		sysUser.setMemberPasswd(secPwd);
		List<Member> users = this.select(sysUser);
		if(users != null && users.size() == 1 && users.get(0) != null) {
			return users.get(0);
		}
		return null;
	}


}
