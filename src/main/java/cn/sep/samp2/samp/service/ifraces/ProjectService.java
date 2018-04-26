package cn.sep.samp2.samp.service.ifraces;

import java.util.List;

import cn.sep.samp2.samp.pojo.ProjectInfo;

public interface ProjectService {
	public String addProject(ProjectInfo project);
	public List<ProjectInfo> findAllProject();
	public List<ProjectInfo> findProject(ProjectInfo project);
	public String delProject(ProjectInfo project);
	public String delProjectBatch(List<ProjectInfo> projList);
	public String removeProject(Integer projId);
	public String modifyProject(ProjectInfo project);
}
