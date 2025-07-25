package com.zsCat.common.beetl.function;

import org.springframework.stereotype.Component;

@Component
public class StrutilFunction {

	public String subStringTo(String str,int start,int end){
		if(str != null && str.length() > 0){
			return str.substring(start, end);
		}
		return "";
	}
	
	public String subStringLen(String str,int len){
		if(str != null && str.length() > 0 && len < str.length()){
			return str.substring(0,len)+"…";
		}
		return str;
	}
	
}
