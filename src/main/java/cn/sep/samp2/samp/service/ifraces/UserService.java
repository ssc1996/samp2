package cn.sep.samp2.samp.service.ifraces;


import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import cn.sep.samp2.samp.pojo.Role;
import cn.sep.samp2.samp.pojo.UserInfo;
import cn.sep.samp2.samp.pojo.UserRole;

public interface UserService {
	
	public String backGroundLogin(UserInfo user,HttpServletRequest req);
	public void userMenu(Integer userId, HttpServletRequest req);
	public String addUser(UserInfo user);
	public String addUserRole(List<UserRole> urList);
	public String modifyUserRole(UserInfo user,List<UserRole> urList);
	public String addRole(Role role);
	public List<UserInfo> findAllUser();
	public List<Role> findAllRole();
	public Map userRole(String userName);
	public Map userRole(Integer userId);
	public UserInfo findUser(String userName);

}
