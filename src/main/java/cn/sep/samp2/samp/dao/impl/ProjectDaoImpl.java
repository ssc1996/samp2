package cn.sep.samp2.samp.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.sep.samp2.samp.dao.ifraces.ProjectDao;
import cn.sep.samp2.samp.pojo.ProjectInfo;

@Repository("ProjectDao")
public class ProjectDaoImpl implements ProjectDao {
	@Autowired
	private SqlSession sqlSession;
	@Override
	public Integer addProject(ProjectInfo project) {
		// TODO Auto-generated method stub
		return sqlSession.insert("cn.sep.samp2.project.addProject", project);
	}
	@Override
	public List<ProjectInfo> findAllProject() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("cn.sep.samp2.project.findAllProject");
	}
	@Override
	public List<ProjectInfo> findProject(ProjectInfo project) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("cn.sep.samp2.project.findProject",project);
	}
	@Override
	public Integer delProject(ProjectInfo project) {
		// TODO Auto-generated method stub
		return sqlSession.update("cn.sep.samp2.project.delProject", project);
	}
	@Override
	public Integer delProjectBatch(List<ProjectInfo> projList) {
		// TODO Auto-generated method stub
		return sqlSession.update("cn.sep.samp2.project.delProjectBatch", projList);
	}
	@Override
	public Integer modifyProject(ProjectInfo project) {
		// TODO Auto-generated method stub
		return sqlSession.update("cn.sep.samp2.project.modifyProject", project);
	}
	@Override
	public Integer removeProject(Integer projId) {
		// TODO Auto-generated method stub
		return sqlSession.delete("cn.sep.samp2.project.removeProject", projId);
	}

}
