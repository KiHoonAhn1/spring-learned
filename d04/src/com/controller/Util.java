package com.controller;

import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public class Util {
	// 받아온 데이터를 서버에 이미지를 올린다.
	public static void saveFile(MultipartFile mf) {
		String dir = "C:\\spring\\d04\\web\\img\\";
		byte[] data;
		String imgname = mf.getOriginalFilename();
		FileOutputStream fo = null;
		try {
			data = mf.getBytes();
		fo = new FileOutputStream(dir+imgname);
			fo.write(data);
		}catch(Exception e) {
			
		}finally {
            try {
                fo.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
		}
		
	}
	
}




