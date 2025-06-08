//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.user.service;

import com.zsCat.common.base.BaseService;
import com.zsCat.web.user.model.MemberGrade;

/**
 * 
 * @author
 */

public interface MemberGradeService extends BaseService<MemberGrade>{

	

	
	/**
	 * 保存或更新
	 * 
	 * @param MemberGrade
	 * @return
	 */
	public int saveMemberGrade(MemberGrade MemberGrade) ;
	/**
	 * 删除
	* @param MemberGrade
	* @return
	 */
	public int deleteMemberGrade(MemberGrade MemberGrade);


}
