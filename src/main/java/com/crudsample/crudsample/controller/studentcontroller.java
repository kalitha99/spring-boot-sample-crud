package com.crudsample.crudsample.controller;

import com.crudsample.crudsample.model.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudsample.crudsample.services.studentservice;

@RestController
@RequestMapping("/student")
public class studentcontroller {
	
	@Autowired
	private studentservice studentservice;
	
	@PostMapping("/add")
	public String add(@RequestBody student student) {
		studentservice.saveStudent(student);
		return "new student added";
		
	}
	
	@GetMapping("/getAll")
	public   List<student> getAllStudents(){
		return studentservice.getAllStudents();
		
	}
	
}
