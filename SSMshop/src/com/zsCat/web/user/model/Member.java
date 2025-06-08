//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.user.model;

import java.util.Date;
import java.math.BigDecimal;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;

import com.zsCat.common.base.BaseEntity;

/**
 * 
 * @author zsCat 2016-11-1 9:36:30
 * @Email: 951449465@qq.com
 * @version 4.0v 会员管理管理
 */
@SuppressWarnings({ "unused" })
@Table(name = "shop_member")
public class Member extends BaseEntity {

	private static final long serialVersionUID = 1L;

	private String memberName;

	public String getMemberName() {
		return this.getString("memberName");
	}

	public void setMemberName(String memberName) {
		this.set("memberName", memberName);
	}

	private String memberTruename;

	public String getMemberTruename() {
		return this.getString("memberTruename");
	}

	public void setMemberTruename(String memberTruename) {
		this.set("memberTruename", memberTruename);
	}

	private String memberAvatar;

	public String getMemberAvatar() {
		return this.getString("memberAvatar");
	}

	public void setMemberAvatar(String memberAvatar) {
		this.set("memberAvatar", memberAvatar);
	}

	private Integer memberSex;

	public Integer getMemberSex() {
		return this.getInteger("memberSex");
	}

	public void setMemberSex(Integer memberSex) {
		this.set("memberSex", memberSex);
	}

	private Long memberBirthday;

	public Long getMemberBirthday() {
		return this.getLong("memberBirthday");
	}

	public void setMemberBirthday(Long memberBirthday) {
		this.set("memberBirthday", memberBirthday);
	}

	private String memberPasswd;

	public String getMemberPasswd() {
		return this.getString("memberPasswd");
	}

	public void setMemberPasswd(String memberPasswd) {
		this.set("memberPasswd", memberPasswd);
	}

	private String memberEmail;

	public String getMemberEmail() {
		return this.getString("memberEmail");
	}

	public void setMemberEmail(String memberEmail) {
		this.set("memberEmail", memberEmail);
	}

	private String memberQq;

	public String getMemberQq() {
		return this.getString("memberQq");
	}

	public void setMemberQq(String memberQq) {
		this.set("memberQq", memberQq);
	}

	private String memberWw;

	public String getMemberWw() {
		return this.getString("memberWw");
	}

	public void setMemberWw(String memberWw) {
		this.set("memberWw", memberWw);
	}

	private Integer memberLoginNum;

	public Integer getMemberLoginNum() {
		return this.getInteger("memberLoginNum");
	}

	public void setMemberLoginNum(Integer memberLoginNum) {
		this.set("memberLoginNum", memberLoginNum);
	}

	private Long createTime;

	public Long getCreateTime() {
		return this.getLong("createTime");
	}

	public void setCreateTime(Long createTime) {
		this.set("createTime", createTime);
	}

	private Long memberLoginTime;

	public Long getMemberLoginTime() {
		return this.getLong("memberLoginTime");
	}

	public void setMemberLoginTime(Long memberLoginTime) {
		this.set("memberLoginTime", memberLoginTime);
	}

	private Long memberOldLogin_time;

	public Long getMemberOldLogin_time() {
		return this.getLong("memberOldLogin_time");
	}

	public void setMemberOldLogin_time(Long memberOldLogin_time) {
		this.set("memberOldLogin_time", memberOldLogin_time);
	}

	private String memberLoginIp;

	public String getMemberLoginIp() {
		return this.getString("memberLoginIp");
	}

	public void setMemberLoginIp(String memberLoginIp) {
		this.set("memberLoginIp", memberLoginIp);
	}

	private String memberOldLogin_ip;

	public String getMemberOldLogin_ip() {
		return this.getString("memberOldLogin_ip");
	}

	public void setMemberOldLogin_ip(String memberOldLogin_ip) {
		this.set("memberOldLogin_ip", memberOldLogin_ip);
	}

	private String memberOpenid;

	public String getMemberOpenid() {
		return this.getString("memberOpenid");
	}

	public void setMemberOpenid(String memberOpenid) {
		this.set("memberOpenid", memberOpenid);
	}

	private String memberInfo;

	public String getMemberInfo() {
		return this.getString("memberInfo");
	}

	public void setMemberInfo(String memberInfo) {
		this.set("memberInfo", memberInfo);
	}

	private Integer memberConsumePoints;

	public Integer getMemberConsumePoints() {
		return this.getInteger("memberConsumePoints");
	}

	public void setMemberConsumePoints(Integer memberConsumePoints) {
		this.set("memberConsumePoints", memberConsumePoints);
	}

	private Integer memberRankPoints;

	public Integer getMemberRankPoints() {
		return this.getInteger("memberRankPoints");
	}

	public void setMemberRankPoints(Integer memberRankPoints) {
		this.set("memberRankPoints", memberRankPoints);
	}

	private Long availablePredeposit;

	public Long getAvailablePredeposit() {
		return this.getLong("availablePredeposit");
	}

	public void setAvailablePredeposit(Long availablePredeposit) {
		this.set("availablePredeposit", availablePredeposit);
	}

	private Long freezePredeposit;

	public Long getFreezePredeposit() {
		return this.getLong("freezePredeposit");
	}

	public void setFreezePredeposit(Long freezePredeposit) {
		this.set("freezePredeposit", freezePredeposit);
	}

	private Integer informAllow;

	public Integer getInformAllow() {
		return this.getInteger("informAllow");
	}

	public void setInformAllow(Integer informAllow) {
		this.set("informAllow", informAllow);
	}

	private Integer isBuy;

	public Integer getIsBuy() {
		return this.getInteger("isBuy");
	}

	public void setIsBuy(Integer isBuy) {
		this.set("isBuy", isBuy);
	}

	private Integer isAllowtalk;

	public Integer getIsAllowtalk() {
		return this.getInteger("isAllowtalk");
	}

	public void setIsAllowtalk(Integer isAllowtalk) {
		this.set("isAllowtalk", isAllowtalk);
	}

	private Integer memberState;

	public Integer getMemberState() {
		return this.getInteger("memberState");
	}

	public void setMemberState(Integer memberState) {
		this.set("memberState", memberState);
	}

	private Integer memberCredit;

	public Integer getMemberCredit() {
		return this.getInteger("memberCredit");
	}

	public void setMemberCredit(Integer memberCredit) {
		this.set("memberCredit", memberCredit);
	}

	private Integer memberSnsvisitnum;

	public Integer getMemberSnsvisitnum() {
		return this.getInteger("memberSnsvisitnum");
	}

	public void setMemberSnsvisitnum(Integer memberSnsvisitnum) {
		this.set("memberSnsvisitnum", memberSnsvisitnum);
	}

	private Long memberAreaid;

	public Long getMemberAreaid() {
		return this.getLong("memberAreaid");
	}

	public void setMemberAreaid(Long memberAreaid) {
		this.set("memberAreaid", memberAreaid);
	}

	private Long memberCityid;

	public Long getMemberCityid() {
		return this.getLong("memberCityid");
	}

	public void setMemberCityid(Long memberCityid) {
		this.set("memberCityid", memberCityid);
	}

	private Integer memberProvinceid;

	public Integer getMemberProvinceid() {
		return this.getInteger("memberProvinceid");
	}

	public void setMemberProvinceid(Integer memberProvinceid) {
		this.set("memberProvinceid", memberProvinceid);
	}

	private String memberAreainfo;

	public String getMemberAreainfo() {
		return this.getString("memberAreainfo");
	}

	public void setMemberAreainfo(String memberAreainfo) {
		this.set("memberAreainfo", memberAreainfo);
	}

	private String memberPrivacy;

	public String getMemberPrivacy() {
		return this.getString("memberPrivacy");
	}

	public void setMemberPrivacy(String memberPrivacy) {
		this.set("memberPrivacy", memberPrivacy);
	}

	private Integer isDel;

	public Integer getIsDel() {
		return this.getInteger("isDel");
	}

	public void setIsDel(Integer isDel) {
		this.set("isDel", isDel);
	}

	private String signCode;

	public String getSignCode() {
		return this.getString("signCode");
	}

	public void setSignCode(String signCode) {
		this.set("signCode", signCode);
	}

	private String signCodeState;

	public String getSignCodeState() {
		return this.getString("signCodeState");
	}

	public void setSignCodeState(String signCodeState) {
		this.set("signCodeState", signCodeState);
	}

	private String memberMobile;

	public String getMemberMobile() {
		return this.getString("memberMobile");
	}

	public void setMemberMobile(String memberMobile) {
		this.set("memberMobile", memberMobile);
	}

	private Long memberGradeid;

	public Long getMemberGradeid() {
		return this.getLong("memberGradeid");
	}

	public void setMemberGradeid(Long memberGradeid) {
		this.set("memberGradeid", memberGradeid);
	}

	private String memberType;

	public String getMemberType() {
		return this.getString("memberType");
	}

	public void setMemberType(String memberType) {
		this.set("memberType", memberType);
	}

}
