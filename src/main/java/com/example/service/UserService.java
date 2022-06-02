package com.example.service;

import java.util.List;

import com.example.model.User;

public interface UserService {

public List<User> findAll();
public User save(User user) ;

public void delete(int userId);
	
}
