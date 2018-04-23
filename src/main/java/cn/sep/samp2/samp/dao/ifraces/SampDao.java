package cn.sep.samp2.samp.dao.ifraces;

import java.util.List;

import cn.sep.samp2.samp.pojo.ModelUtil;
import cn.sep.samp2.samp.pojo.ProjectInfo;
import cn.sep.samp2.samp.pojo.Role;
import cn.sep.samp2.samp.pojo.SampPara;
import cn.sep.samp2.samp.pojo.SampPoint;
import cn.sep.samp2.samp.pojo.SampSample;
import cn.sep.samp2.samp.pojo.UserInfo;

public interface SampDao {
	public UserInfo getUserInfo(UserInfo userInfo);
	public int addProjInfo(ModelUtil model);
	public List<UserInfo> getCompStaff(Integer compId);
	public List<ProjectInfo> getProjByComp(ModelUtil model);
	public String insertSamp(SampPoint point);
	public List<SampPoint> getSampByProjId(ModelUtil model);
	public String getMaxVersion();
	public ModelUtil getMaxVersionApk();
	public List<Role> getRoleNames();
	public String addUser(UserInfo user);
	public int addUserRole(ModelUtil model);
	public List<Role> getRoleIdByName(String[] roles);
	public int editUser(ModelUtil model);
	public List<UserInfo> getUsers(UserInfo user);
	public int addSampPara(List<SampPara> paras);
	public int addSampSample(List<SampSample> samples);
	public List<SampPara> getSampParaByProjId(ModelUtil model);
	public List<SampSample> getSampSampleByProjId(ModelUtil model);
}
