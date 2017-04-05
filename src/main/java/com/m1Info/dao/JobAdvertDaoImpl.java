package com.m1Info.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.m1Info.bean.JobAdvert;
import com.m1Info.bean.User;

public class JobAdvertDaoImpl extends HibernateDaoSupport implements JobAdvertDao{

	public void addJobAdvert(JobAdvert jobAdvert) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(jobAdvert);
		
	}

	public JobAdvert getJobAdvert(int id) {
		// TODO Auto-generated method stub
		JobAdvert jobAdvert=(JobAdvert) getHibernateTemplate().get(JobAdvert.class, new Integer(id));
		return jobAdvert;
	}

}
