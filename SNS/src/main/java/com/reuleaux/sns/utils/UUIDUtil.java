package com.reuleaux.sns.utils;

import java.util.UUID;

public class UUIDUtil {
	/**
	 * @return 生成一个唯一标识
	 */
	public static String getUUID(){
		
		return UUID.randomUUID().toString().replaceAll("-","");
		
	}
	
}
