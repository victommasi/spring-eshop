package com.victommasi.eshop.service;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.victommasi.eshop.dao.ProductDao;
import com.victommasi.eshop.service.ImageService;

@Service
public class ImageService {

	@Autowired
	ProductDao productDao;
	
	public byte[] convert2Byte(MultipartFile image) {
		byte[] byteArr = null;
		
		try {
			byteArr = image.getBytes();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return byteArr;
	}
	
	public String convert2String(Integer id) {
		String base64Encoded = null;
		
		try {
			byte[] encodeBase64 = Base64.encodeBase64(productDao.findImage(id));
			if(encodeBase64 == null){
				return "";
			}
			base64Encoded = new String(encodeBase64, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return base64Encoded;
	}

}
