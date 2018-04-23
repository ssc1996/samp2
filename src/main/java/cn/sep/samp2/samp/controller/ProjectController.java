package cn.sep.samp2.samp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.sep.samp2.samp.pojo.ProjectInfo;

@Controller
@RequestMapping(value="project")
public class ProjectController {
	
	public String addProject(ProjectInfo project){
		return "";
	}
	
	public String findProject() {
		return null;
	}
}
