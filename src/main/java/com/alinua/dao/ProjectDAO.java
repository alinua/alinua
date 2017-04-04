package com.alinua.dao;

import java.util.Vector;

import com.alinua.beans.Project;

public interface ProjectDAO {

	public boolean save(Project project);
	public boolean update(Project project);
	public boolean remove(Project project);
	public Vector<Project> getProjects();
}
