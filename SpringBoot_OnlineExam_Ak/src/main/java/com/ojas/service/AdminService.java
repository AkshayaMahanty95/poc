package com.ojas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.dao.AdminDao;
import com.ojas.dao.QuestionDao;
import com.ojas.domain.Admin;
import com.ojas.domain.Question;


@Service
public class AdminService {

	@Autowired
	private AdminDao admindao;
	@Autowired
	private QuestionDao qdao;
	
	public Admin newAdmin(Admin admin) {
		return admindao.save(admin);
	}
	
	public Question newQuestion(Question question) {
		return qdao.save(question);
	}

	public void save(Admin admin) {
		admindao.save(admin);
	}

	public List<Admin> findAll() {
		return admindao.findAll();
	}
	
	
}
