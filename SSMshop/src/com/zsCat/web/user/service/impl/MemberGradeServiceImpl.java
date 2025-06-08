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
import com.zsCat.web.user.service.MemberGradeService;
import com.zsCat.web.user.mapper.MemberGradeMapper;

import com.zsCat.web.user.model.MemberGrade;
import com.zsCat.web.sys.model.SysOffice;
import com.zsCat.web.sys.model.SysRole;

/**
 * 
 * @author
 */

@Service("MemberGradeService")
public class MemberGradeServiceImpl  extends ServiceMybatis<MemberGrade> implements MemberGradeService {

	@Resource
	private MemberGradeMapper MemberGradeMapper;

	
	/**
	 * 保存或更新
	 * 
	 * @param MemberGrade
	 * @return
	 */
	public int saveMemberGrade(MemberGrade MemberGrade) {
		return this.save(MemberGrade);
	}

	/**
	 * 删除
	* @param MemberGrade
	* @return
	 */
	public int deleteMemberGrade(MemberGrade MemberGrade) {
		return this.delete(MemberGrade);
	}


}
