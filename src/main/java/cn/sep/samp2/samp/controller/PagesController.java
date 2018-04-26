package cn.sep.samp2.samp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.sep.samp2.samp.pojo.ProjectInfo;
import cn.sep.samp2.samp.service.ifraces.ProjectService;
import cn.sep.samp2.samp.service.ifraces.UserService;

@Controller
@RequestMapping(value="pages")
public class PagesController {
	@Autowired
	private UserService userService;
	@Autowired
	private ProjectService projService;
	@RequestMapping(value="user")
	public ModelAndView userPage(){
		ModelAndView mav = new ModelAndView();
		mav.addObject("allUser", userService.findAllUser());
		mav.setViewName("/pages/user/user");
		return mav;
	}
	@RequestMapping(value="role")
	public ModelAndView rolePage() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("allRole", userService.findAllRole());
		mav.setViewName("/pages/user/role");
		return mav;
	}
	@RequestMapping(value="power")
	public ModelAndView powerPage() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/pages/user/power");
		return mav;
	}
	@RequestMapping(value="project")
	public ModelAndView projectPage(ProjectInfo project) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("allProject", projService.findProject(project));
		mav.setViewName("/pages/project/project");
		return mav;
	}
	@RequestMapping(value="datadb")
	public ModelAndView initSysPage() {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("/pages/init/initSys");
		return mav;
	}
}
