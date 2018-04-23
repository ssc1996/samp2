package cn.sep.samp2.samp.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class StaticPara {
	public static List<String> imagesName = new ArrayList<String>();
	static {
		imagesName.add("FE");
		imagesName.add("FS");
		imagesName.add("FW");
		imagesName.add("FN");
		imagesName.add("OD");
		imagesName.add("SD");
		imagesName.add("B1");
		imagesName.add("B2");
	}
	public static String filePath = "D:\\Samp2\\SampImages";
	public static String chchePath = "D:\\Samp2\\Cache";
}
