package com.fashionsuperior.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.fashionsuperior.config.JwtProvider;
import com.fashionsuperior.exception.UserException;
import com.fashionsuperior.model.User;
import com.fashionsuperior.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	private UserRepository userRepository;
	private JwtProvider jwtProvider;

	public UserServiceImpl(UserRepository userRepository, JwtProvider jwtProvider) {
		this.userRepository = userRepository;
		this.jwtProvider = jwtProvider;
	}

	@Override
	public User findUserById(Long userId) throws UserException {
		Optional<User> user=userRepository.findById(userId);
		if(user.isPresent())
			return user.get();
		
		throw new UserException("User not found with Id "+userId);
	}

	@Override
	public User findUserProfileByJwt(String jwt) throws UserException {
		String email=jwtProvider.getEmailFromToken(jwt);
		User user=userRepository.findByEmail(email);
		if(user==null)
			throw new UserException("User Not Found With Email "+email);
		return user;
	}

	@Override
	public List<User> findAllUsers() {
		return userRepository.findAllByOrderByCreatedAtDesc();
	}


}
