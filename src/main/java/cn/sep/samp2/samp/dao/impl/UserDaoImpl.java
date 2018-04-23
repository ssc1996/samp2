package cn.sep.samp2.samp.dao.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.sep.samp2.samp.dao.ifraces.UserDao;
import cn.sep.samp2.samp.pojo.Role;
import cn.sep.samp2.samp.pojo.UserInfo;
import cn.sep.samp2.samp.pojo.UserRole;

@Repository("UserDao")
public class UserDaoImpl implements UserDao {
	@Autowired
	private SqlSession sqlSession;
	public UserInfo backGroundLogin(UserInfo user) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("cn.sep.samp2.user.backLogin", user);
	}
	public List<Role> userMenu(Integer userId) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("cn.sep.samp2.user.userMenu", userId);
	}
	public Integer addUser(UserInfo user) {
		// TODO Auto-generated method stub
		return sqlSession.insert("cn.sep.samp2.user.insUser", user);
	}
	public Integer modifyUser(UserInfo user) {
		// TODO Auto-generated method stub
		return sqlSession.update("cn.sep.samp2.user.modifyUser", user);
	}
	public Integer addUserRole(List<UserRole> urList){
		// TODO Auto-generated method stub
		return sqlSession.insert("cn.sep.samp2.user.insUserRoleBatch", urList);
	}
	public Integer modifyUserRole(List<UserRole> urList){
		// TODO Auto-generated method stub
		return sqlSession.insert("cn.sep.samp2.user.insUserRoleBatch", urList);
	}
	public Integer delUserRole(UserRole userRole){
		// TODO Auto-generated method stub
		return sqlSession.delete("cn.sep.samp2.user.delUserRole",userRole);
	}
	public Integer addRole(Role role){
		// TODO Auto-generated method stub
		return sqlSession.insert("cn.sep.samp2.user.insRole", role);
	}
	public List<UserInfo> findAllUser() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("cn.sep.samp2.user.findAllUser");
	}
	public List<Role> findAllRole() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("cn.sep.samp2.user.findAllRole");
	}
	public UserInfo findUser(String userName) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("cn.sep.samp2.user.findUser",userName);
	}
	@Override
	public Integer createDB() throws SQLException {
		// TODO Auto-generated method stub
		 sqlSession.getConnection().createStatement().executeUpdate("create database samp4 ");
		return 1;
	}

}
