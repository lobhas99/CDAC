package com.fashionsuperior.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.fashionsuperior.model.User;
import com.fashionsuperior.repository.UserRepository;

@Service
public class CustomUserServiceImpl implements UserDetailsService {

	private UserRepository userRepository;

	public CustomUserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByEmail(username);
		if (user == null)
			throw new UsernameNotFoundException("user not found with email"+username);
		List<GrantedAuthority> authorities=new ArrayList<>();
		
		return new org.springframework.security.core.userdetails.User(user.getEmail(),user.getPassword(),authorities);
	}

}
