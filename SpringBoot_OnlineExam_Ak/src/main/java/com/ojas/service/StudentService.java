package com.ojas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ojas.dao.AdminDao;
import com.ojas.dao.QuestionDao;
import com.ojas.dao.StudentDao;
import com.ojas.domain.Admin;
import com.ojas.domain.Question;
import com.ojas.domain.Student;


@Service
public class StudentService implements UserDetailsService {

	@Autowired
	private StudentDao studentdao;
	@Autowired
	private AdminDao admindao;
	
	@Autowired
	private QuestionDao qdao;
	
	public Student newStudent(Student student) {
		return studentdao.save(student);
	}
	
	public List<Student> getStudent() {
		return studentdao.findAll();
	}

	//Retrive Question details
	public List<Question> findAll() {
		return qdao.findAll();
	}

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Student student = studentdao.findByEmail(email);
		Admin admin = admindao.findByEmail(email);
		if(student == null)
			throw new UsernameNotFoundException("user 404");
		
		return new UserPrinciple(student, admin);
	}
}
