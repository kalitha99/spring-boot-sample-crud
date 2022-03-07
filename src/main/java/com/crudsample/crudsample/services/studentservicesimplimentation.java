package com.crudsample.crudsample.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudsample.crudsample.model.student;
import com.crudsample.crudsample.repository.studentRepository;

@Service
public class studentservicesimplimentation implements studentservice{
	
	@Autowired
	private studentRepository studentRepository;
	
	@Override
	
	public student saveStudent(student student) {
		return studentRepository.save(student);
		
	}
}
