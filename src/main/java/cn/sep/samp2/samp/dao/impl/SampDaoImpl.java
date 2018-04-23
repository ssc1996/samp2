package cn.sep.samp2.samp.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.sep.samp2.samp.dao.ifraces.SampDao;
import cn.sep.samp2.samp.pojo.ModelUtil;
import cn.sep.samp2.samp.pojo.ProjectInfo;
import cn.sep.samp2.samp.pojo.Role;
import cn.sep.samp2.samp.pojo.SampPara;
import cn.sep.samp2.samp.pojo.SampPoint;
import cn.sep.samp2.samp.pojo.SampSample;
import cn.sep.samp2.samp.pojo.UserInfo;

@Repository("SampDao")
public class SampDaoImpl implements SampDao{
	
	@Autowired
	SqlSessionTemplate sqlSession;
	public UserInfo getUserInfo(UserInfo userInfo) {
		UserInfo user = sqlSession.selectOne("cn.sep.samp2.samp.getUserInfo",userInfo);
		return user;
	}
	@Override
	public int addProjInfo(ModelUtil model) {
		int row = sqlSession.insert("cn.sep.samp2.samp.addProjInfo", model);
		return row;
	}
	@Override
	public List<UserInfo> getCompStaff(Integer compId) {
		List<UserInfo> users = sqlSession.selectList("cn.sep.samp2.samp.getCompStaff",compId);
		return users;
	}
	@Override
	public List<ProjectInfo> getProjByComp(ModelUtil model) {
		List<ProjectInfo> projs = sqlSession.selectList("cn.sep.samp2.samp.getProjByComp",model);
		return projs;
	}
	@Override
	public String insertSamp(SampPoint point) {
		sqlSession.insert("cn.sep.samp2.samp.insertSamp",point);
		return point.getSampId();
	}
	@Override
	public List<SampPoint> getSampByProjId(ModelUtil model) {
		List<SampPoint> list = sqlSession.selectList("cn.sep.samp2.samp.getSampByProjId",model);
		return list;
	}
	@Override
	public String getMaxVersion() {
		String max = sqlSession.selectOne("cn.sep.samp2.samp.getMaxVersion");
		return max;
	}
	@Override
	public ModelUtil getMaxVersionApk() {
		ModelUtil model = sqlSession.selectOne("cn.sep.samp2.samp.getMaxVersionApk");
		return model;
	}
	@Override
	public List<Role> getRoleNames() {
		List<Role> roles = sqlSession.selectList("cn.sep.samp2.samp.getRoleNames");
		return roles;
	}
	@Override
	public String addUser(UserInfo user) {
		sqlSession.insert("cn.sep.samp2.samp.addUser",user);
		String id = user.getUserId();
		return id;
	}
	@Override
	public int addUserRole(ModelUtil model) {
		int row = sqlSession.insert("cn.sep.samp2.samp.addUserRole",model);
		return row;
	}
	@Override
	public List<Role> getRoleIdByName(String[] roles) {
		List<Role> rolel = sqlSession.selectList("cn.sep.samp2.samp.getRoleIdByName",roles);
		return rolel;
	}
	@Override
	public int editUser(ModelUtil model) {
		int row = sqlSession.update("cn.sep.samp2.samp.editUser",model);
		return row;
	}
	@Override
	public List<UserInfo> getUsers(UserInfo user) {
		List<UserInfo> users = sqlSession.selectList("cn.sep.samp2.samp.getUsers",user);
		return users;
	}
	@Override
	public int addSampPara(List<SampPara> paras) {
		int row = sqlSession.insert("cn.sep.samp2.samp.addSampPara",paras);
		return row;
	}
	@Override
	public int addSampSample(List<SampSample> samples) {
		int row = sqlSession.insert("cn.sep.samp2.samp.addSampSample",samples);
		return row;
	}
	@Override
	public List<SampPara> getSampParaByProjId(ModelUtil model) {
		List<SampPara> paras = sqlSession.selectList("cn.sep.samp2.samp.getSampParaByProjId",model);
		return paras;
	}
	@Override
	public List<SampSample> getSampSampleByProjId(ModelUtil model) {
		List<SampSample> samples = sqlSession.selectList("cn.sep.samp2.samp.getSampSampleByProjId",model);
		return samples;
	}

}
