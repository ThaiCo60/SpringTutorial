package com.helloworld.service;

import com.helloworld.model.User;

public interface UserService {
	User findByUsername(String username);
}
