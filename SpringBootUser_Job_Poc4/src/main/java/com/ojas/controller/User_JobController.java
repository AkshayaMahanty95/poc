package com.ojas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.entity.Job;
import com.ojas.entity.User;
import com.ojas.service.User_JobService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
@Api(value = "Swagger-Controller")
@RestController
public class User_JobController {
	@Autowired
	private User_JobService service;
	
	@ApiOperation(value = "create user information")
	@PostMapping("/user/createuser")
	public User cteateNewUser(@RequestBody User user) {
		return service.cteateNewUser(user);
	}
	
	@ApiOperation(value = "create job post")
	@PostMapping("/job/postjob")
	public Job createNewJob(@RequestBody Job job) {
		return service.createNewJob(job);
	}
	
	//Get Job by ID
	@ApiOperation(value = "get job post by id")
	@GetMapping("/job/getjob/{jobid}")
	public Optional<Job> getJobById(@PathVariable int jobid){
		return service.getJobById(jobid);
	}
	
	//get Job by Type
	@ApiOperation(value = "get job post by type")
	@GetMapping("/job/getByType/{type}")
	public List<Job> getJobByType(@PathVariable String type){
		return service.getJobByType(type);
	}
	
	//get Job by Experience
//	@GetMapping("/job/getByExp/{experience}")
//	public Iterable<Job> getJobByexperience(@PathVariable int experience){
//		return service.getJobByexperience(experience);
//	}
	
	//Filter Job by Country:
	@ApiOperation(value = "get job post by country")
	@GetMapping("/job/getByCountry/{country}")
	public List<Job> getJobBycountry(@PathVariable String country){
		return service.getJobBycountry(country);
	}
	
	//Filter Job by Availability
	@ApiOperation(value = "get job post by country")
	@GetMapping("/job/getByAvailability/{availability}")
	public List<Job> getJobByavailability(@PathVariable String availability){
		return service.getJobByavailability(availability);
	}
	
	//-> Filter Job by Skills:
	@ApiOperation(value = "get job post by country")
	@GetMapping("/job/getBySkills/{skills}")
	public List<Job> getJobByskills(@PathVariable String skills){
		return service.getJobskills(skills);
	}
	
	//-> Filter Job by Language:
	@ApiOperation(value = "get job post by country")
	@GetMapping("/job/getByLanguage/{language}")
	public List<Job> getJobBylanguage(@PathVariable String language){
		return service.getJoblanguage(language);
	}
	
	//-> Filter Job by PayRate:
	@ApiOperation(value = "get job post by country")
	@GetMapping("/job/getByPayRate/{payRate}")
	public List<Job> getJobBypayRate(@PathVariable int payRate){
		return service.getJobpayRate(payRate);
	}
	
	//-> Get All Jobs:
	@ApiOperation(value = "get job post by country")
	@GetMapping("/job/getalljobs")
	public List<Job> getJobAll(@RequestBody Job job){
		return service.getJobAll(job);
	}
	//-> Get All User:
	@ApiOperation(value = "get job post by country")
	@GetMapping("user/getalluser")
	public Iterable<User> getUser(@RequestBody User user){
		return service.getUser(user);
	}
}
