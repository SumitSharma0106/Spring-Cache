package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Data;

public interface Repo extends JpaRepository<Data, Integer> {

}
