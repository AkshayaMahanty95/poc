package com.example.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.modules.Person;

public interface PersonDao extends MongoRepository<Person, Integer> {

}
