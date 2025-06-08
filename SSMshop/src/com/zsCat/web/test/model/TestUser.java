//Powered By ZSCAT, Since 2014 - 2020

package com.zsCat.web.test.model;

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
 * @author zsCat 2016-11-7 19:44:30
 * @Email: 951449465@qq.com
 * @version 4.0v
 *	test管理
 */
@SuppressWarnings({ "unused"})
@Table(name="test_user")
public class TestUser extends BaseEntity {

	private static final long serialVersionUID = 1L;

  		 private String username;
public String getUsername() {return this.getString("username");}
public void setUsername(String username) {this.set("username",username);}
private String password;
public String getPassword() {return this.getString("password");}
public void setPassword(String password) {this.set("password",password);}
private String nickname;
public String getNickname() {return this.getString("nickname");}
public void setNickname(String nickname) {this.set("nickname",nickname);}


}
