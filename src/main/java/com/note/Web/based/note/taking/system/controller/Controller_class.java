package com.note.Web.based.note.taking.system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.note.Web.based.note.taking.system.pojo.Pojo;

@RestController

public class Controller_class {
	@GetMapping("/fetchname")
	public String fetchName() {
		return "welcome to IT-C";
		
	}
	@GetMapping("/fetchemploydetails")
	public Pojo fetchEmployeeDetails() {
		return new Pojo("Sam",1159,20);
		
	}
}	
