package com.crudsample.crudsample.services;

import java.util.List;

import com.crudsample.crudsample.model.student;

public interface studentservice {
	
	public student  saveStudent(student student);
	public List <student> getAllStudents();

}
