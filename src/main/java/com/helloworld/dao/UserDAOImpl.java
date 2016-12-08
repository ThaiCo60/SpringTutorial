package com.helloworld.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.helloworld.model.User;

public class UserDAOImpl implements UserDAO {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	@SuppressWarnings("unchecked")
	public User findByUsername(String username) {
		List<User> users = sessionFactory.getCurrentSession().createQuery("from User where username = ?")
				.setParameter(0, username).list();

		return (users.size() > 0) ? users.get(0) : null;
	}

}
