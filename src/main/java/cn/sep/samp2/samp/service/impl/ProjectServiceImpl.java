package cn.sep.samp2.samp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.sep.samp2.samp.dao.ifraces.ProjectDao;
import cn.sep.samp2.samp.pojo.ProjectInfo;
import cn.sep.samp2.samp.service.ifraces.ProjectService;
import cn.sep.samp2.samp.util.Constants;

@Service("ProjectService")
public class ProjectServiceImpl implements ProjectService {
	
	@Autowired(required=false)
	private ProjectDao projDao;

	@Override
	public String addProject(ProjectInfo project) {
		// TODO Auto-generated method stub
		return (projDao.addProject(project) -1 == 0) ? Constants.INSERTSUCCESS : Constants.INSERTFILED;
	}

	@Override
	public List<ProjectInfo> findAllProject() {
		// TODO Auto-generated method stub
		return projDao.findAllProject();
	}

	@Override
	public List<ProjectInfo> findProject(ProjectInfo project) {
		// TODO Auto-generated method stub
		return projDao.findProject(project);
	}

	@Override
	public String delProject(ProjectInfo project) {
		// TODO Auto-generated method stub
		return projDao.delProject(project)-1 == 0 ? Constants.DELSUCCESS : Constants.DELFILED;
	}

	@Override
	public String delProjectBatch(List<ProjectInfo> projList) {
		// TODO Auto-generated method stub
		return (projDao.delProjectBatch(projList) - projList.size()) == 0 ? Constants.DELSUCCESS : Constants.DELFILED;
	}

	@Override
	public String modifyProject(ProjectInfo project) {
		// TODO Auto-generated method stub
		return (projDao.modifyProject(project) - 1 == 0) ? Constants.UPDATESUCCESS : Constants.UPDATEFILED;
	}

	@Override
	public String removeProject(Integer projId) {
		// TODO Auto-generated method stub
		return (projDao.removeProject(projId) - 1 == 0) ? Constants.DELSUCCESS : Constants.DELFILED;
	}
	
}
