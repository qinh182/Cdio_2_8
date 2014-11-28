/**
 * 
 */
package com.cdio.planx.utils;

/**
 * @author Administrator
 *
 */
public class CdioUtils {

	/**
	 * 空字符串检测
	 * @param str
	 * @return
	 */
	public static boolean isEmptyStr(String str){
	   return str==null || str.trim().length()==0;	
	}
}
