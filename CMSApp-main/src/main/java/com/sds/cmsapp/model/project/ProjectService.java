package com.sds.cmsapp.model.project;

import java.util.List;

import com.sds.cmsapp.domain.Project;

public interface ProjectService {
	
	public int insert(Project project);
	public Project selectByProjectIdx(int project_idx);
	
	public List selectAll();
}
