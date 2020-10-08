package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Data implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1667215875575318519L;
	@Id
	private int id;
	private String name;
	private String address;

}
