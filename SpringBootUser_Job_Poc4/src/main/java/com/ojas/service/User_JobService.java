package com.ojas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.dao.JobDao;
import com.ojas.dao.UserDao;
import com.ojas.entity.Job;
import com.ojas.entity.User;


@Service
public class User_JobService {
	@Autowired
	private UserDao userdao;
	@Autowired
	private JobDao jobdao;

	// create user
	public User cteateNewUser(User user) {
		return userdao.save(user);
	}

	// create job
	public Job createNewJob(Job job) {
		return jobdao.save(job);
	}
	
	//Get Job by ID
	public Optional<Job> getJobById(int  jobid) {
		return jobdao.findById(jobid);
	}
	
	//get Job by Type
	public List<Job> getJobByType(String type){
		return jobdao.findByJobType(type);
	}
	
	//get Job by Experience
//	public Iterable<Job> getJobByexperience(int experience){
//		return jobdao.findByJobexperience(experience);
//	}
	
	//Filter Job by Country:
	public List<Job> getJobBycountry(String country){
		return jobdao.findByCountry(country);
	}
	
	//Filter Job by Availability
	public List<Job> getJobByavailability(String availability){
		return jobdao.findByAvailability(availability);
	}
	
	//-> Filter Job by Skills:
	public List<Job> getJobskills(String skills){
		return jobdao.findByskills(skills);
	}
	
	//-> Filter Job by Language:
	public List<Job> getJoblanguage(String language){
		return jobdao.findBylanguage(language);
	}
	
	//-> Filter Job by PayRate:
	public List<Job> getJobpayRate(int payRate){
		return jobdao.findBypayRate(payRate);
	}
	
	//-> Get All Jobs:
	public List<Job> getJobAll(Job job){
		return jobdao.findAll();
	}
	
	//getting All user
	public Iterable<User> getUser(User user){
		return userdao.findAll();
	}
	
	//getting Job
	public Iterable<Job> getJob(Job job){
		return jobdao.findAll();
	}
	
	//EXCEL file
	
	
	
	
	
	
	
	
	
	
	
	

}
