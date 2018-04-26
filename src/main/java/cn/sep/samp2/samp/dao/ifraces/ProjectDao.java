package cn.sep.samp2.samp.dao.ifraces;

import java.util.List;

import cn.sep.samp2.samp.pojo.ProjectInfo;

public interface ProjectDao {
	public Integer addProject(ProjectInfo project);
	public List<ProjectInfo> findAllProject();
	public List<ProjectInfo> findProject(ProjectInfo project);
	public Integer delProject(ProjectInfo project);
	public Integer delProjectBatch(List<ProjectInfo> projList);
	public Integer removeProject(Integer projId);
	public Integer modifyProject(ProjectInfo project);
}
