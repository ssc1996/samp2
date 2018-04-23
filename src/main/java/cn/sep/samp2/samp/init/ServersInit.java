package cn.sep.samp2.samp.init;

import java.io.File;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import cn.sep.samp2.samp.util.StaticPara;

public class ServersInit extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init() throws ServletException {
		//初始文件夹
		createFile(StaticPara.chchePath,StaticPara.filePath);
    }
	public void createFile(String... s){
		for(String ss : s){
			File f = new File(ss);
			if(!f.exists()){
				f.mkdirs();
			}
		}
	}
}
