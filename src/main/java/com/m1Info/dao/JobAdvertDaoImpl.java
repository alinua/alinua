package com.m1Info.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.m1Info.bean.JobAdvert;
import com.m1Info.bean.User;

public class JobAdvertDaoImpl extends HibernateDaoSupport implements JobAdvertDao{

	public void addJobAdvert(JobAdvert jobAdvert) {


                      /**
                        *  Description addJobAdvert
                        *
                        *
                        *  cette fonction va nous permettre de sauvegarder les données que nous avons reçu
                        *  dans la base de données.
                        *
                        *
                        *  @param      jobAdver   informations que l'on souhaite sauvegarder   
                        *
                        *
                       */
		// TODO Auto-generated method stub
		getHibernateTemplate().save(jobAdvert);
		
	}

	public JobAdvert getJobAdvert(int id) {



                     /**
                        *  Description getJobAdvert
                        *
                        *
                        *  cette fonction va nous permettre d'afficher les données que nous avons 
                        *  dans la base de données et qui correspondent à l'id entré en paramètre.
                        *
                        *
                        *  @param      id       identifiant que l'on souhaite afficher
                        *
                        *  @return     id;title;location;industry;date;skills;description;degree;User_id;
                        *
                       */
		// TODO Auto-generated method stub
		JobAdvert jobAdvert=(JobAdvert) getHibernateTemplate().get(JobAdvert.class, new Integer(id));
		return jobAdvert;
	}

}
