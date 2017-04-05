package com.m1Info.dao;

import com.m1Info.bean.JobAdvert;

public interface JobAdvertDao {


                       /**
                        *  Description interface JobAdvertDao
                        *
                        *
                        *  
                        *  c'est l'interface que l'on va utiliser pour implémenter le JobAdvertDaoImpl
                        *  avec les deux fonctions add et get
                        *
                        *    
                        *
                        *
                       */

	void addJobAdvert(JobAdvert jobAdvert);
	JobAdvert getJobAdvert(int i);

}
