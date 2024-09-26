package com.example.project4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.example.project4.entity.Student;
import com.example.project4.repository.StudentRepository;
import com.example.project4.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	StudentService studentservice;

	@Autowired
	StudentRepository studentrepository;
	
	@GetMapping("index")
	public String getDetails() {
		return "index";
	}
	
	// testing purpose
	
	// testing purpose 1

	@PostMapping("savedetails")
	public RedirectView savedetails(Student student) {
//		studentservice.savedetails(student);
		studentrepository.save(student);
		return new RedirectView("index");
	}
	
//	@PostMapping("savedetails")
//	public String savedetails(Student student) {
//		studentrepository.save(student);
//		return "added";
//	}
	
}
