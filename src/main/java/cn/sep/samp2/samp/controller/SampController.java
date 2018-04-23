package cn.sep.samp2.samp.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.util.Zip4jConstants;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.io.FileUtils;
import com.sun.mail.handlers.message_rfc822;

import cn.sep.samp2.samp.pojo.ModelUtil;
import cn.sep.samp2.samp.pojo.ProjectInfo;
import cn.sep.samp2.samp.pojo.Role;
import cn.sep.samp2.samp.pojo.SampPoint;
import cn.sep.samp2.samp.pojo.UserInfo;
import cn.sep.samp2.samp.service.impl.SampServiceImpl;
import cn.sep.samp2.samp.util.MethodUtil;
import cn.sep.samp2.samp.util.Para;
import cn.sep.samp2.samp.util.StaticPara;

@RequestMapping("samp/")
@Controller("SampController")
public class SampController {
	@Autowired
	SampServiceImpl sampService;

	@ResponseBody
	@RequestMapping("test")
	public String test(String str, HttpServletRequest request) {
		// Enumeration heads = request.getHeaderNames();
		// while(heads.hasMoreElements()){
		// String head = (String) heads.nextElement();
		// System.out.println(head);
		// System.out.println(request.getHeader(head));
		// }
		// System.out.println(request.getMethod());
		// System.out.println("str"+str);
		// Enumeration names = request.getParameterNames();
		// while(names.hasMoreElements()){
		// String name = (String) names.nextElement();
		// System.out.println(name);
		// System.out.println(request.getParameter(name));
		// }
		System.out.println("1111111111111");
		return "0";
	}

	@ResponseBody
	@RequestMapping("login")
	public UserInfo getUserInfo(String userName, String userPwd) {
		UserInfo user = sampService
				.getUserInfo(new UserInfo(userName, userPwd));
		return user;
	}

	@ResponseBody
	@RequestMapping("addProj")
	public int addProj(ProjectInfo proj, String userStr) {
		UserInfo user = UserInfo.getUserInfo(userStr);
		int row = sampService.addProjInfo(proj, user);
		return row;
	}

	@ResponseBody
	@RequestMapping("getCompStaff")
	public List<String> getCompStaff(Integer compId) {
		List<UserInfo> users = sampService.getCompStaff(compId);
		List<String> userNames = new ArrayList<String>();
		for (UserInfo user : users) {
			userNames.add(user.getUserName());
		}
		return userNames;
	}

	@ResponseBody
	@RequestMapping("getProjByComp")
	public String getProjByComp(String projIds) {
		List<ProjectInfo> projs = sampService.getProjByComp(1, projIds);
		return MethodUtil.listToString(projs);
	}

	@ResponseBody
	@RequestMapping("insertSamp")
	public String insertSamp(String sampStr, String sampParaStr,
			String sampSampleStr) {
		String id = sampService.insertSamp(sampStr, sampParaStr, sampSampleStr);
		return id;
	}

	@ResponseBody
	@RequestMapping("getSampByProjId")
	public String getSampByProjId(String projId, String sampIds) {
		List<SampPoint> list = sampService.getSampByProjId(projId, sampIds);
		return MethodUtil.listToString(list);
	}

	@ResponseBody
	@RequestMapping("getSampAllByProjId")
	public String getSampAllByProjId(String projId, String sampIds) {
		String samp = sampService.getSampAllByProjId(projId, sampIds);
		return samp;
	}

//	@ResponseBody
//	@RequestMapping("getMaxVersion")
//	public String getMaxVersion() {
//		String max = sampService.getMaxVersion();
//		return max;
//	}

	@ResponseBody
	@RequestMapping("getMaxVersionApk")
	public void getMaxVersionApk(HttpServletRequest request,
			HttpServletResponse response) {
		try {
			File fileDisk = new File(request.getSession().getServletContext().getRealPath("/")+"/assets/apk/sampapp");
			File file = new File(fileDisk,fileDisk.list()[0]);
			InputStream fin = new FileInputStream(file);
			ServletOutputStream out = null;
			try {
				response.setContentType("application/vnd.android.package-archive");
				response.addHeader("Content-Disposition",
						"attachment;filename=samp2.apk");
				out = response.getOutputStream();
				byte[] buffer = new byte[512];
				int bytesToRead = -1;
				while ((bytesToRead = fin.read(buffer)) != -1) {
					out.write(buffer, 0, bytesToRead);
				}
			} finally {
				if (fin != null)
					fin.close();
				if (out != null)
					out.close();
			}
		} catch (IOException e) {
			System.err.println(e);
		}
	}

	@ResponseBody
	@RequestMapping("getRoleNames")
	public String getRoleNames() {
		List<Role> roles = sampService.getRoleNames();
		return MethodUtil.listToString(roles);
	}

	@ResponseBody
	@RequestMapping("addUser")
	public int addUser(String userStr, String userRole) {
		int row = sampService.addUser(userStr, userRole);
		return row;
	}

	@ResponseBody
	@RequestMapping("editUser")
	public int editUser(String userId, String userPwd) {
		int row = sampService.editUser(new ModelUtil(userId, userPwd));
		return row;
	}

	@ResponseBody
	@RequestMapping("getUsersInfo")
	public String getUsersInfo() {
		List<UserInfo> users = sampService.getUsers(new UserInfo());
		return MethodUtil.listToString(users);
	}

	@ResponseBody
	@RequestMapping("updateImage")
	public int updateImage(HttpServletRequest request) {
		System.out.print("添加图片");
		int row = 0;
		try {
			DiskFileItemFactory factory = new DiskFileItemFactory();
			ServletFileUpload upload = new ServletFileUpload(factory);
			List<FileItem> list = upload.parseRequest(request);
			request.setCharacterEncoding("utf-8");
			upload.setHeaderEncoding("UTF-8");
			factory.setSizeThreshold(1024 * 1000);
			upload.setSizeMax(1024 * 1024 * 10);
			for (FileItem item : list) {
				String name = item.getName();
				if (item.isFormField()) {

				} else {
					if (name != null && !"".equals(name)) {
						InputStream is = item.getInputStream();
						FileOutputStream out = new FileOutputStream(new File(
								Para.IMAGEPATH, name));
						byte buffer[] = new byte[1024];
						int len = 0;
						while ((len = is.read(buffer)) > 0) {
							out.write(buffer, 0, len);
						}
						out.close();
						is.close();
						item.delete();
						row += 1;
					}
				}
			}
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
		System.out.println(row + "张");
		return row;
	}

	@ResponseBody
	@RequestMapping("getSampImages")
	public int getSampImages(String projId, String sampsId) {
		System.out.println(projId);
		System.out.println(sampsId);
		int num = 0;
		File files = new File(Para.IMAGEPATH);
		String[] samps = sampsId.split(",");
		List<String> sampsList = Arrays.asList(samps);
		if (files.exists()) {
			String[] strs = files.list();
			for (String str : strs) {
				String[] ss = str.split("_");
				if (ss[0].equals(projId) && sampsList.contains(ss[2])) {
					num += 1;
				}
			}
		}
		System.out.println(num);
		return num;
	}

	@ResponseBody
	@RequestMapping("downImagesBySampId")
	public ResponseEntity<byte[]> downImagesBySampId(String projId,String projNo,String sampServerId) {
		System.out.println(sampServerId+"进来");
		File zipFile = null;
		HttpHeaders headers = new HttpHeaders();    
        String zipName=sampServerId+".zip";
        headers.setContentDispositionFormData("attachment", zipName);   
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		ArrayList<File> list = new ArrayList<File>();
		String[] ssis = sampServerId.split(",");
		for(String s : ssis){
			if(s!=null&&!"".equals(s)){
				String fileName = "S_" + projId + "_" + projNo + "_" + s	+ "_";
				for (String f : StaticPara.imagesName) {
					File file = new File(StaticPara.filePath, fileName + f + ".jpg");
					if (file.exists()) {
						list.add(file);
					}
				}
			}
		}
		if (list.size() > 0) {
			try {
				File chcheDisk = new File(StaticPara.chchePath);
				if(!chcheDisk.exists()){
					chcheDisk.mkdirs();
				}
				File chcheFile = new File(StaticPara.chchePath+"\\sampImagesCache.zip");
				if(chcheFile.exists()){
					chcheFile.delete();
				}
				ZipFile zip = new ZipFile(StaticPara.chchePath+"\\sampImagesCache.zip");
				zip.setFileNameCharset("UTF-8");
				ZipParameters para = new ZipParameters();
				para.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);
				para.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);
				zip.addFiles(list, para);
				zipFile = new File(StaticPara.chchePath+"\\sampImagesCache.zip");
			} catch (Exception e) {
				System.out.println("downImagesBySampId异常" + e);
			}
		} else {
			return null;
		}
		try {
			return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(zipFile),    
			        headers, HttpStatus.CREATED);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;

	}

}
