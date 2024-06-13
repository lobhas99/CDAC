package com.fashionsuperior.service;

import java.util.List;

import com.fashionsuperior.exception.UserException;
import com.fashionsuperior.model.User;

public interface UserService {

	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;

	public List<User> findAllUsers();
}
