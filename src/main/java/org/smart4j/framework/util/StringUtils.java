package org.smart4j.framework.util;

/**
 * Created by zhongbo on 2018/1/15.
 * 字符串工具类
 */
public class StringUtils {
   /*判断字符串是否为空*/
   public static boolean isEmpty(String str){
       if(str!=null){
           str=str.trim();
       }
       return StringUtils.isEmpty(str);
   }
   /*判断字符串是否非空*/
   public static boolean isNotEmpty(String str){
       return !isEmpty(str);
   }
}
