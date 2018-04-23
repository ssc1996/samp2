package cn.sep.samp2.samp.service.impl;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.sep.samp2.samp.dao.ifraces.UserDao;
import cn.sep.samp2.samp.pojo.ReRole;
import cn.sep.samp2.samp.pojo.Role;
import cn.sep.samp2.samp.pojo.UserInfo;
import cn.sep.samp2.samp.pojo.UserRole;
import cn.sep.samp2.samp.pojo.UserRoleList;
import cn.sep.samp2.samp.service.ifraces.UserService;
import cn.sep.samp2.samp.util.Constants;

@Service("UserService")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	public String backGroundLogin(UserInfo user, HttpServletRequest req) {
		// TODO Auto-generated method stub
		user = userDao.backGroundLogin(user);
		String respPage = "redirect:/index.jsp";
		if(user != null) {
			userMenu(Integer.parseInt(user.getUserId()),req);
			req.getSession().setAttribute("user", user);
			req.getSession().setAttribute("loginMsg", "");
			respPage = "/pages/main/main";
		}else{
			req.getSession().setAttribute("loginMsg", "用户名或密码有误!请确认后再试");
			respPage = "redirect:/backIndex.jsp";
		}
		return respPage;
	}
	public void userMenu(Integer userId, HttpServletRequest req){
		List<Role> menuList =  userDao.userMenu(userId);
		Map<String,List<Role>> menuRole = new HashMap<String,List<Role>>();
		menuRole.put("oneMenu", new ArrayList<Role>());
		menuRole.put("secMenu", new ArrayList<Role>());
		menuRole.put("threeMenu", new ArrayList<Role>());
		for(Role menu : menuList ){
			if( menu.getMenuGrade()-1 == 0){
				menuRole.get("oneMenu").add(menu);
				continue;
			}
			if( menu.getMenuGrade()-2 == 0){
				menuRole.get("secMenu").add(menu);
				continue;
			}
			if( menu.getMenuGrade()-3 == 0){
				menuRole.get("threeMenu").add(menu);
				continue;
			}
		}
		req.getSession(true).setAttribute("userMenu", menuRole);
	}
	public String addUser(UserInfo user) {
		// TODO Auto-generated method stub
		if(null != user && !user.getUserName().trim().isEmpty() && !user.getUserPhone().trim().isEmpty()) {
			return userDao.addUser(user)==1?Constants.INSERTSUCCESS:Constants.INSERTFILED;
		}
		return Constants.LACKOFDATA;
	}
	public String addUserRole(List<UserRole> urList){
		List<UserRole> addURList = new ArrayList<UserRole>();
		for(UserRole userRole : urList){
			if(userRole.getRoleId() != null && userRole.getUserId() != null){
				addURList.add(userRole);
			}
		}
		return userDao.addUserRole(addURList) == addURList.size()?Constants.INSERTSUCCESS:Constants.INSERTFILED;
	}
	public String modifyUserRole(UserInfo user,List<UserRole> urList){
		userDao.modifyUser(user);
		List<UserRole> modifyURList = new ArrayList<UserRole>();
		for(UserRole userRole : urList){
			if(userRole.getRoleId() != null && userRole.getUserId() != null){
				modifyURList.add(userRole);
			}
		}
		UserRole userRole = new UserRole();
		userRole.setUserId(modifyURList.get(0).getUserId());
		userDao.delUserRole(userRole);
		return userDao.modifyUserRole(modifyURList) == modifyURList.size()?Constants.INSERTSUCCESS:Constants.INSERTFILED;
	}
	public String addRole(Role role){
		return userDao.addRole(role)==1?Constants.INSERTSUCCESS:Constants.INSERTFILED;
	}
	public List<UserInfo> findAllUser() {
		// TODO Auto-generated method stub
		return userDao.findAllUser();
	}
	public List<Role> findAllRole() {
		// TODO Auto-generated method stub
		return userDao.findAllRole();
	}
	public List<Role> findAllRole(Integer userId) {
		// TODO Auto-generated method stub
		return userDao.userMenu(userId);
	}
	public UserInfo findUser(String userName) {
		// TODO Auto-generated method stub
		return userDao.findUser(userName);
	}
	public Map userRole(String userName) {
		// TODO Auto-generated method stub
		Map<String, Object> roleMap = new HashMap<String, Object>();
		roleMap.put("userId", findUser(userName).getUserId());
		roleMap.put("roleList", findAllRole());
		return roleMap;
	}
	public Map userRole(Integer userId) {
		// TODO Auto-generated method stub
		Map<String, Object> roleMap = new HashMap<String, Object>();
		roleMap.put("userId", userId);
		roleMap.put("roleList", findAllRole(userId));
		return roleMap;
	}

}
