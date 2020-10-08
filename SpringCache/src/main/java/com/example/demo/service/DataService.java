package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.demo.exception.NotFoundException;
import com.example.demo.model.Data;
import com.example.demo.repo.Repo;

@Service
public class DataService {
	
	@Autowired
	Repo repo;
	
	@Cacheable(cacheNames = { "userCache" })
	public List<Data> findAll(){
		System.out.println("Hit DB 1st time in getUsers()");
		return repo.findAll();
	}
	
	@Cacheable(value = "userCache", key = "#id", unless = "#result==null")
	public Optional<Data> findById(int id) {
		Optional<Data> findById = repo.findById(id);
		if(!findById.isPresent())
			throw new NotFoundException("Not found " + id);
		System.out.println("Hit DB 1st time in getUser()");
		return findById;
		
	}
	
	@CacheEvict(value = "userCache")
	public void deleteById(int id){
		Optional<Data> findById = repo.findById(id);
		if(!findById.isPresent())
			throw new NotFoundException("Not found " + id +" for delete");
		repo.deleteById(id);
	}

}
