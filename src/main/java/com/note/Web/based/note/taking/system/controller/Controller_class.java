package com.note.Web.based.note.taking.system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller_class {
	@GetMapping("/fetchname")
	public String fetchName() {
		return "welcome to IT-C";
		
	}

}
