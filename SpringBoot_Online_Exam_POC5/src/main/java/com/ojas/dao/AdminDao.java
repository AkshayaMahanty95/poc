package com.ojas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ojas.entity.Admin;

public interface AdminDao extends JpaRepository<Admin, Integer> {

}
