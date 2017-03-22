package com.m1Info.action;

import com.m1Info.bean.JobAdvert;
import com.m1Info.dao.JobAdvertDao;


public class JobAdvertAction {

	JobAdvertDao jobAdvertDao;
	
	
	
	public JobAdvertDao getJobAdvertDao() {
		return jobAdvertDao;
	}


	public void setJobAdvertDao(JobAdvertDao jobAdvertDao) {
		this.jobAdvertDao = jobAdvertDao;
	}


	public String addJobAdvertAction(){
		
		JobAdvert jobAdvert=new JobAdvert();
		jobAdvert.setDate("date");
		jobAdvert.setDegree("degree");
		jobAdvert.setDescription("description");
		jobAdvert.setIndustry("industry");
		jobAdvert.setLocation("location");
		jobAdvert.setSkills("skills");
		jobAdvert.setTitle("title");
		jobAdvert.setUser_id(1);
		
		jobAdvertDao.addJobAdvert(jobAdvert);
	
		
	
		System.out.println("JobAdvert ajouté");
		return "success";
	
	}
	
	
	public String getJobAdvertAction(){
		

		int id=1;
		JobAdvert jobAdvert=jobAdvertDao.getJobAdvert(id);
		System.out.println("JobAdvert recupéré "+jobAdvert.getTitle());
		return "success";
	
	}
	
	public String execute() throws Exception {
		


		return "success";

	}
}
