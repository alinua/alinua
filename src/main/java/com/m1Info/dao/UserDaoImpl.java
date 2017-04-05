package com.m1Info.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.m1Info.bean.User;

import javax.persistence.Query;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao{
	
	public void addUser(User user) {
		// TODO Auto-generated method stub

		getHibernateTemplate().save(user);

	}
	
	public User getUser(String id) {
		// TODO Auto-generated method stub7
		User user=(User) getHibernateTemplate().get(User.class, id);
	
//MERGING
//import javax.persistence.Query;
//
//public class UserDaoImpl extends HibernateDaoSupport implements UserDao{
//
//	
//	
//	
///**
// *  Ajouter un nouveau utilisateur (Enregister le nouveau utilisateur 
// *  user dans la base de donnée Hibernate)
// *
// *  @param user le nouveau utilisateur à ajouter           
// * 
// */
//
//	public void addUser(User user) {
//		// TODO Auto-generated method stub
//		getHibernateTemplate().save(user);
//		
//	}
//
//
///**
//*  Retourner un utilisateur (Recupérer un utilisateur de la base de donnée 
//*  hibernate par son id)
//*
//*  @param id id de l'utilisateur                   
//*  @return l'utilisateur ayant l'id en paramétre
//*/
//
//
//	public User getUser(int id) {
//		// TODO Auto-generated method stub7
//		User user=(User) getHibernateTemplate().get(User.class, new Integer(id));
		return user;
	}

}
