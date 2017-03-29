package com.m1Info.dao;

import com.m1Info.bean.JobAdvert;

public interface JobAdvertDao {

	void addJobAdvert(JobAdvert jobAdvert);
	JobAdvert getJobAdvert(int i);

}
