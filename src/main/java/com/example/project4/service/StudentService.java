package com.example.project4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project4.entity.Student;
import com.example.project4.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentrepository;

	public String savedetails(Student student) {
		studentrepository.save(student);
		return "added";
	}
	
}
