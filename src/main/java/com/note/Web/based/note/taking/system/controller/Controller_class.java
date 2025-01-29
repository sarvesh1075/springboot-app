package com.note.Web.based.note.taking.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.note.Web.based.note.taking.system.pojo.Pojo;
import com.note.Web.based.note.taking.system.service.serviceclass;

@RestController

public class Controller_class {
	
	@Autowired
	serviceclass service;
	
	@GetMapping("/fetchname")
	public String fetchName() {
		return "welcome to IT-C";
		
	}
	@GetMapping("/fetchemployeedetails")
	public Pojo fetchEmployeeDetails() {
		return new Pojo("Sam",1159,20);
		
	}
	
	@GetMapping("/fetchdetails")
	public Pojo fetchdetails() {
		return service.fetchPojoDetails(); 
	}
	
}	
