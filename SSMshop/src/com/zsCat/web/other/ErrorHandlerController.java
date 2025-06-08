package com.zsCat.web.other;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zsCat.common.utils.LogUtils;

@Controller
@RequestMapping("/ErrorHandler")
public class ErrorHandlerController {

	@RequestMapping
	public String errorHandler(HttpServletRequest request){
		//LogUtils.logPageError(request);
		return "error/error";
	}
	
}
