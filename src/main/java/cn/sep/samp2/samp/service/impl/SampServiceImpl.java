package cn.sep.samp2.samp.service.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sun.security.krb5.internal.crypto.dk.ArcFourCrypto;

import com.alibaba.fastjson.JSONObject;

import cn.sep.samp2.samp.dao.impl.SampDaoImpl;
import cn.sep.samp2.samp.pojo.ModelUtil;
import cn.sep.samp2.samp.pojo.ProjectInfo;
import cn.sep.samp2.samp.pojo.Role;
import cn.sep.samp2.samp.pojo.SampPara;
import cn.sep.samp2.samp.pojo.SampPoint;
import cn.sep.samp2.samp.pojo.SampSample;
import cn.sep.samp2.samp.pojo.UserInfo;
import cn.sep.samp2.samp.service.ifraces.SampService;
import cn.sep.samp2.samp.util.MethodUtil;

@Service("SampService")
public class SampServiceImpl implements SampService{
	
	@Autowired
	SampDaoImpl sampDao;
	@Override
	public UserInfo getUserInfo(UserInfo userInfo) {
		UserInfo user = sampDao.getUserInfo(userInfo);
//		user.setUserMenu(MethodUtil.strRemoveRepeat(user.getUserMenu()));
		return user;
	}
	@Override
	public int addProjInfo(ProjectInfo proj,UserInfo user) {
		ModelUtil model= new ModelUtil(proj, user);
		int row = sampDao.addProjInfo(model);
		return row;
	}
	@Override
	public List<UserInfo> getCompStaff(Integer compId) {
		List<UserInfo> users = sampDao.getCompStaff(compId);
		return users;
	}
	@Override
	public List<ProjectInfo> getProjByComp(Integer compId,String projIds) {
		String[] strs = new String[]{"-1"};
		if(projIds!=null&&!"".equals(projIds)){
			strs = projIds.split(",");
		}
		List<ProjectInfo> projs = sampDao.getProjByComp(new ModelUtil(compId+"",strs));
		return projs;
	}
	@Override
	@Transactional
	public String insertSamp(String sampStr,String sampParaStr,String sampSampleStr) {
		SampPoint point = JSONObject.parseObject(sampStr,SampPoint.class);
		String id = sampDao.insertSamp(point);
		if(sampParaStr!=null&&!"".equals(sampParaStr)){
			String[] str1 = sampParaStr.split("&");
			List<SampPara> paras = new ArrayList<SampPara>();
			for(String str : str1){
				SampPara sampPara = JSONObject.parseObject(str,SampPara.class);
				sampPara.setSampServerId(id);
				paras.add(sampPara);
			}
			if(paras.size()!=0){
				sampDao.addSampPara(paras);
			}
		}
		if(sampSampleStr!=null&&!"".equals(sampSampleStr)){
			String[] str2 = sampSampleStr.split("&");
			List<SampSample> samples = new ArrayList<SampSample>();
			for(String str : str2){
				SampSample sampSample = JSONObject.parseObject(str,SampSample.class);
				sampSample.setSampServerId(id);
				samples.add(sampSample);
			}
			if(samples.size()!=0){
				sampDao.addSampSample(samples);
			}
		}
		File file = new File("D:\\Samp2\\SampImages");
		if(!file.exists()){
			file.mkdirs();
		}
		return id;
	}
	@Override
	public List<SampPoint> getSampByProjId(String projId,String sampIds) {
		String[] strs = new String[]{"-1"};
		if(null!=sampIds&&!"".equals(sampIds)){
			strs = sampIds.split(",");
		}
		ModelUtil model = new ModelUtil(projId, strs);
		List<SampPoint> list = sampDao.getSampByProjId(model);
		return list;
	}
	@Override
	public String getMaxVersion() {
		String max = sampDao.getMaxVersion();
		return max;
	}
	@Override
	public ModelUtil getMaxVersionApk() {
		ModelUtil model = sampDao.getMaxVersionApk();
		return model;
	}
	@Override
	public List<Role> getRoleNames() {
		List<Role> roles = sampDao.getRoleNames();
		return roles;
	}
	@Transactional
	@Override
	public int addUser(String userStr,String userRole) {
		UserInfo user = JSONObject.parseObject(userStr,UserInfo.class);
		user.setUserRole(userRole);
		int row = 0;
		String id = sampDao.addUser(user);
		if(id!=null&&!"".equals(id)){
			String[] roleStr = userRole.split(",");
			List<Role> roles = sampDao.getRoleIdByName(roleStr);
			ModelUtil model = new ModelUtil(id, roles);
			row = sampDao.addUserRole(model);
		}
		return row;
	}
	@Override
	public int editUser(ModelUtil model) {
		int row = sampDao.editUser(model);
		return row;
	}
	@Override
	public List<UserInfo> getUsers(UserInfo user) {
		List<UserInfo> users = sampDao.getUsers(user);
		return users;
	}
	
	@Override
	public String getSampAllByProjId(String projId, String sampIds) {
		String[] strs = new String[]{"-1"};
		if(null!=sampIds&&!"".equals(sampIds)){
			strs = sampIds.split(",");
		}
		ModelUtil model = new ModelUtil(projId, strs);
		List<SampPoint> list = sampDao.getSampByProjId(model);
		List<SampPara> paras = sampDao.getSampParaByProjId(model);
		List<SampSample> samples = sampDao.getSampSampleByProjId(model);
		String result = MethodUtil.listToString(list)+"&&&"+MethodUtil.listToString(paras)+"&&&"+MethodUtil.listToString(samples);
		return result;
	}	
}
