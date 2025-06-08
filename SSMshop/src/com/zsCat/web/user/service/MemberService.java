//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.user.service;

import com.zsCat.common.base.BaseService;
import com.zsCat.web.sys.model.SysUser;
import com.zsCat.web.user.model.Member;

/**
 * 
 * @author
 */

public interface MemberService extends BaseService<Member>{

	

	
	/**
	 * 保存或更新
	 * 
	 * @param Member
	 * @return
	 */
	public int saveMember(Member Member) ;
	/**
	 * 删除
	* @param Member
	* @return
	 */
	public int deleteMember(Member Member);
	public Member checkMember(String username, String password);


}
