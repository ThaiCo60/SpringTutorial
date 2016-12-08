package com.helloworld.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.helloworld.dao.UserDAO;
import com.helloworld.model.User;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
    private UserDAO dao;
	
	@Override
	public User findByUsername(String username) {
		return dao.findByUsername(username);
	}

}
