package cn.sep.samp2.samp.dao.ifraces;

import java.sql.SQLException;
import java.util.List;

import cn.sep.samp2.samp.pojo.Role;
import cn.sep.samp2.samp.pojo.UserInfo;
import cn.sep.samp2.samp.pojo.UserRole;

public interface UserDao {

	public UserInfo backGroundLogin(UserInfo user);
	public List<Role> userMenu(Integer userId);
	public Integer addUser(UserInfo user);
	public Integer modifyUser(UserInfo user);
	public Integer addUserRole(List<UserRole> urList);
	public Integer modifyUserRole(List<UserRole> urList);
	public Integer delUserRole(UserRole userRole);
	public Integer addRole(Role role);
	public List<UserInfo> findAllUser();
	public UserInfo findUser(String userName);
	public List<Role> findAllRole();
	
	
	public Integer createDB() throws SQLException;
}
