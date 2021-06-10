package com.ojas.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.domain.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {
	public Student findByEmail(String email);
}
