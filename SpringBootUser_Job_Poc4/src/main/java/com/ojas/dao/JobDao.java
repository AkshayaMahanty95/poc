package com.ojas.dao;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.entity.Job;
@Repository
public interface JobDao extends JpaRepository<Job, Integer> {

	public List<Job> findByJobType(String jobType);
	
//	public Iterable<Job> findByJobexperience(int experience);
	
	public List<Job> findByCountry(String country);
	
	public List<Job> findByAvailability(String availability);

	public List<Job> findByskills(String skills);
	
	public List<Job> findBylanguage(String language);
	
	public List<Job> findBypayRate(int payRate);
	



}
