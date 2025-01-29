package com.note.Web.based.note.taking.system.service;

import org.springframework.stereotype.Service;

import com.note.Web.based.note.taking.system.pojo.Pojo;

@Service
public class serviceclass {
	
	public Pojo fetchPojoDetails() {
		return new Pojo("Sam",12,21);
		
	}

}
