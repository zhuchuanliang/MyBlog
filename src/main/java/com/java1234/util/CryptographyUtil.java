package com.java1234.util;

import org.apache.shiro.crypto.hash.Md5Hash;

/*
 * MD5º”√‹π§æﬂ
 */
public class CryptographyUtil {
	
	public static String md5(String str,String salt) {
		return new Md5Hash(str,salt).toString();
	}
	
	public static void main(String[] args) {
		System.out.println(md5("123456","java1234"));
	}

}
