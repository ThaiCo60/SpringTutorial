package com.helloworld.dao;

import com.helloworld.model.User;

public interface UserDAO {
	User findByUsername(String username);
}
