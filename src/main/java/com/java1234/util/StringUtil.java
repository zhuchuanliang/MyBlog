package com.java1234.util;

import java.util.ArrayList;
import java.util.List;

/**2018��3��22��
 * @author Administrator
 *�����һ���ַ��������࣬���幦�����ж��ַ����Ƿ�Ϊ�գ���ʽ�����ݿ��ģ����ѯ�����ַ���ǰ���%�������˵���������Ŀո�
 */
public class StringUtil {
	
	/**�ж��Ƿ�Ϊ��
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
	
	
	/**���ַ���ǰ���%
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
