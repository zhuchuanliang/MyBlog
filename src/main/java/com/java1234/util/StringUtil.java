package com.java1234.util;

import java.util.ArrayList;
import java.util.List;

/**2018年3月22日
 * @author Administrator
 *定义的一个字符串工具类，具体功能由判断字符串是否为空，格式化数据库的模糊查询（在字符串前后加%），过滤掉集合里面的空格
 */
public class StringUtil {
	
	/**判断是否为空
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str) {
		if(str==null||"".equals(str.trim())){
			return true;
		}else{
			return false;
		}
	}
	
	
	/**给字符串前后加%
	 * @param str
	 * @return
	 */
	public static String formatLike(String str) {
		if(!isEmpty(str)) {
			return "%"+str+"%";
		}else {
			return null;
		}
	}
	
	
	public static List<String> filterWhite(List<String> list){
		List<String> resultList=new ArrayList<String>();
		for(String s:list) {
			if(!isEmpty(s)) {
				resultList.add(s);
			}
		}
		return resultList;
	}

}
