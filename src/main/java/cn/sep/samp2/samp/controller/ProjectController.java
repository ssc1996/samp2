package cn.sep.samp2.samp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.sep.samp2.samp.pojo.ProjectInfo;
import cn.sep.samp2.samp.service.ifraces.ProjectService;

@Controller
@RequestMapping(value="project")
public class ProjectController {
	@Autowired(required=false)
	private ProjectService projService;
	
	@ResponseBody
	@RequestMapping(value="addProject", method=RequestMethod.POST)
	public String addProject(ProjectInfo project){
		return projService.addProject(project);
	}
	@ResponseBody
	@RequestMapping(value="findProject")
	public List<ProjectInfo> findProject() {
		return projService.findAllProject();
	}
	@ResponseBody
	@RequestMapping(value="removeProject")
	public String removeProject(Integer projId) {
		return projService.removeProject(projId);
	}
}
