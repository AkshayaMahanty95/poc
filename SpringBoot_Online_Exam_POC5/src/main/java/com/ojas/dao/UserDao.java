package com.ojas.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, Long> {

	public User findByUsername(String username);

}
