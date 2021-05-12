package com.ojas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ojas.dao.UserDao;
import com.ojas.entity.User;

@Service
public class UserService implements UserDetailsService{

	@Autowired
	private UserDao userdao;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userdao.findByUsername(username);
		if(user == null)
			throw new UsernameNotFoundException("user 404");
		
		return new UserPrinciple(user);
	}

}
