package cn.sep.samp2.samp.service.ifraces;

import java.util.List;

import cn.sep.samp2.samp.pojo.ModelUtil;
import cn.sep.samp2.samp.pojo.ProjectInfo;
import cn.sep.samp2.samp.pojo.Role;
import cn.sep.samp2.samp.pojo.SampPoint;
import cn.sep.samp2.samp.pojo.UserInfo;

public interface SampService {
	public UserInfo getUserInfo(UserInfo userInfo);
	public int addProjInfo(ProjectInfo proj,UserInfo user);
	public List<UserInfo> getCompStaff(Integer compId);
	public List<ProjectInfo> getProjByComp(Integer compId,String projIds);
	public String insertSamp(String sampStr,String sampParaStr,String sampSampleStr);
	public List<SampPoint> getSampByProjId(String projId,String sampIds);
	public String getSampAllByProjId(String projId,String sampIds);
	public String getMaxVersion();
	public ModelUtil getMaxVersionApk();
	public List<Role> getRoleNames();
	public int addUser(String userStr,String userRole);
	public int editUser(ModelUtil model);
	public List<UserInfo> getUsers(UserInfo user);
}
