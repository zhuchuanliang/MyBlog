package com.java1234.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	
	
	/**日期格式转换成字符串
	 * @param date
	 * @param format
	 * @return
	 */
	public static String formatDate(Date date,String format) {
		String result="";
		SimpleDateFormat sdf=new SimpleDateFormat(format);
		if(date!=null) {
			result=sdf.format(date);
		}
		return result;
	}
	
	/**字符串转换为日期格式
	 * @param str
	 * @param format
	 * @return
	 * @throws ParseException
	 */
	public Date formatString(String str,String format) throws ParseException {
		if(StringUtil.isEmpty(str)) {
			return null;
		}
		SimpleDateFormat sdf=new SimpleDateFormat(format);
		return sdf.parse(str);
	}
	
	
	
	/**获取当前日期
	 * @return
	 * @throws Exception
	 */
	public static String getCurrentDateStr()throws Exception{
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddhhmmss");
		return sdf.format(date);
	}
	

}
