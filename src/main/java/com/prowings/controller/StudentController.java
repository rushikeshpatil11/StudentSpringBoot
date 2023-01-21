package com.prowings.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prowings.model.Student;
import com.prowings.service.StudentService;


@RestController
public class StudentController {

	@Autowired
	private StudentService service;
	


	@GetMapping("/hello")
	public String getHello() {
		return "Hello";
	}

	@PostMapping("/student")
	public Student createNewStudent(@RequestBody Student student) {
		return service.createNewStudnet(student);
	}

	@GetMapping("/student/{roll}")
	public Student getStudent(@PathVariable("roll") int roll) {
		return service.getStudent(roll);
	}
	
	@DeleteMapping("/student/{roll}")
	public String deleteStudent(@PathVariable("roll") int roll) {
		return service.deleteStudnet(roll);
	}
	
	@PutMapping("/student")
	public Student deleteStudent(@RequestBody Student student) {
		return service.updateStudent(student);
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudents() {
		return service.getAllStudents();
	}
	
	
	
}
