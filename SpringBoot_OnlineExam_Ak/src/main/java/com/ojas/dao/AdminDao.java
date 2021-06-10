package com.ojas.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.domain.Admin;

@Repository
public interface AdminDao extends JpaRepository<Admin, Integer> {
	public Admin findByEmail(String email);

}
