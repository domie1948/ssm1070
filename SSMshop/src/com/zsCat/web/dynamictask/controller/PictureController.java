package com.zsCat.web.dynamictask.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.zsCat.common.utils.JsonUtils;
import com.zsCat.web.dynamictask.service.PictureServiceImpl;

/**
 * 上传图片处理
 * <p>Title: PictureController</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.com</p> 
 * @author	zsCat
 * @date	2016年9月4日下午3:18:33
 * @version 1.0
 */
//@Controller
public class PictureController {

	//@Autowired
	private PictureServiceImpl pictureService;
	
	//@RequestMapping("/pic/upload")
	//@ResponseBody
	public String pictureUpload(MultipartFile uploadFile) {
		Map result = pictureService.uploadPicture(uploadFile);
		//为了保证功能的兼容性，需要把Result转换成json格式的字符串。
		String json = JsonUtils.objectToJson(result);
		return json;
	}
}
