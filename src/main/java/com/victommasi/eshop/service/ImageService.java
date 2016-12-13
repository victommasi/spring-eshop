package com.victommasi.eshop.service;

import org.springframework.web.multipart.MultipartFile;

public interface ImageService {

	byte[] convert2Byte(MultipartFile image);
	
	String convert2String(Integer id);
}
