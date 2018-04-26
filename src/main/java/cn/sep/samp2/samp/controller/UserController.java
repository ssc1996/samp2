package cn.sep.samp2.samp.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.sep.samp2.samp.pojo.Role;
import cn.sep.samp2.samp.pojo.UserInfo;
import cn.sep.samp2.samp.pojo.UserRoleList;
import cn.sep.samp2.samp.service.ifraces.UserService;

@Controller
@RequestMapping(value="user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="backLogin", method=RequestMethod.POST)
	public String backLogin(UserInfo user,HttpServletRequest req){
		return userService.backGroundLogin(user, req);
	}
	@RequestMapping(value="removeUser", method=RequestMethod.GET)
	public String removeUser(HttpServletRequest req){
		req.getSession(true).removeAttribute("user");
		return "redirect:/backIndex.jsp";
	}
	@RequestMapping(value="addUser" ,method=RequestMethod.POST)
	@ResponseBody
	public String addUser(UserInfo users){
		return userService.addUser(users);
	}
	@ResponseBody
	@RequestMapping(value="addUserRole" ,method=RequestMethod.POST)
	public String addUserRole(UserRoleList urList){
		return userService.addUserRole(urList.getUrList());
	}
	@ResponseBody
	@RequestMapping(value="modifyUserRole" ,method=RequestMethod.POST)
	public String modifyUserRole(UserInfo user,UserRoleList urList){
		return userService.modifyUserRole(user,urList.getUrList());
	}
	@ResponseBody
	@RequestMapping(value="addRole" ,method=RequestMethod.POST)
	public String addRole(Role role){
		return userService.addRole(role);
	}
	@ResponseBody
	@RequestMapping(value="findRole" ,method=RequestMethod.POST)
	public Map findRole(String userName){
		return userService.userRole(userName);
	}
	@ResponseBody
	@RequestMapping(value="findRoleByUserId" ,method=RequestMethod.POST)
	public Map findRole(Integer userId){
		return userService.userRole(userId);
	}
	@ResponseBody
	@RequestMapping(value="findUser" ,method=RequestMethod.POST)
	public UserInfo findUser(String userName){
		return userService.findUser(userName);
	}
	@ResponseBody
	@RequestMapping(value="findAllUser" ,method=RequestMethod.POST)
	public List<UserInfo> findAllUser(){
		return userService.findAllUser();
	}
	
	
	
	

}
