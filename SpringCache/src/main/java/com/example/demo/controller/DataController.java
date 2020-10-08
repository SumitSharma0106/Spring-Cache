package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Data;
import com.example.demo.service.DataService;

@RestController
public class DataController {
	
	@Autowired
	DataService service;
	
	@GetMapping("/findAll")
	public List<Data> findAll(){
		return service.findAll();
	}
	
	@GetMapping("/find/{id}")
	public Optional<Data> findById(@PathVariable int id) {
		return service.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deletById(@PathVariable int id) {		
		service.deleteById(id);
	}

}
