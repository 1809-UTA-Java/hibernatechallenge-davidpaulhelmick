package com.revature.dao;

import java.util.List;

import org.hibernate.Session;

import com.revature.model.Request;
import com.revature.util.HibernateUtil;

public class RequestDao {
	public List<Request> getEmployees() {
		Session session = HibernateUtil.getSession();
		return session.createQuery("from Request").list();
	}
}
