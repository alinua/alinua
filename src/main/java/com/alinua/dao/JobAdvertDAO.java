package com.alinua.dao;

import java.util.Vector;

import com.alinua.beans.JobAdvert;

public interface JobAdvertDAO {

	public boolean save(JobAdvert jobAdvert);
	public boolean update(JobAdvert jobAdvert);
	public boolean remove(JobAdvert jobAdvert);
	public Vector<JobAdvert> getJobAdverts();
}
