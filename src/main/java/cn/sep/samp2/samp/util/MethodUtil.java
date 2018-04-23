package cn.sep.samp2.samp.util;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import cn.sep.samp2.samp.pojo.SampPoint;

import com.alibaba.fastjson.JSONObject;

public class MethodUtil {
	public static String getBetween(String str) {
		if (str != null) {
			if (str.length() > 1) {
				return str.substring(1, str.length() - 1);
			} else {
				return str;
			}
		}
		return "";
	}

	public static String getValue(String str) {
		if (str.indexOf("=") != -1) {
			return str.split("=")[1];
		} else {
			return "";
		}
	}

	public static String listToString(List list) {
		StringBuffer sb = new StringBuffer();
		if (list != null && list.size() != 0) {
			for (int i = 0; i < list.size(); i++) {
				if (i != 0) {
					sb.append("&");
				}
				sb.append(JSONObject.toJSON(list.get(i)));
			}
		}else{
			return "null";
		}
		return sb.toString();
	}

	public static String strRemoveRepeat(String str) {
		if (str != null && !"".equals(str)) {
			String[] strs = str.split(",");
			List<String> list = new ArrayList<String>();
			for (String s : strs) {
				if (!list.contains(s)) {
					list.add(s);
				}
			}
			return listToString(list, ",");
		}
		return "";
	}

	public static String listToString(List list, String str) {
		StringBuffer sb = new StringBuffer();
		if (list != null && list.size() != 0) {
			for (int i = 0; i < list.size(); i++) {
				if (i != 0) {
					sb.append(str);
				}
				sb.append(list.get(i));
			}
		}
		return sb.toString();
	}
	public static void existsSamp2FilePath(){
		File file = new File("");
		if(!file.exists()){
			file.mkdirs();
		}
	}
	public static String replice(String str){
		if(str!=null){
			String s1 = str.replace("<","{");
			String s2 = s1.replace(">","}");
			return s2;
		}
		return "";
	}
}
