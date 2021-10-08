package com.hz.ssm.utils;

import java.util.UUID;

public class StringUtils {
	
	public static void main(String[] args) {
	String str = subStrs("laoma.jpg");

		System.out.println(str);
	}
	
	public static String subStrs(String name){
		
		//截取点
		int index = name.lastIndexOf('.');
		
		String str = name.substring(index);
		
		String uuidString = UUID.randomUUID().toString().replace("-", "");
		
		String newStr= uuidString.substring(uuidString.length()-10, uuidString.length());
		
		String newPicNameStr = newStr+str;
		return newPicNameStr;
	}

}
