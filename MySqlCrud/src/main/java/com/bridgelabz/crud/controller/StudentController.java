package com.bridgelabz.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.crud.model.Student;

import com.bridgelabz.crud.service.StudentServiceImpl;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentServiceImpl studentServiceimpl;

	@GetMapping("/stud")
	public List<Student> getAllStudents() {
		
		return studentServiceimpl.getAllStudent();
	}

	@PostMapping("/stud")
	public Student addStudent(@RequestBody Student student) {
		return studentServiceimpl.addStudent(student);
	}

	@PutMapping("/stud/{id}")
	public Student updateStudent(@RequestBody Student student, @PathVariable(value = "id") int id) {
		return studentServiceimpl.updateStudent(id, student);

	}

	@GetMapping("/stud/{id}")
	public Student getStudent(@PathVariable(value = "id") int id) {

		return studentServiceimpl.getStudent(id);

	}
	
	@DeleteMapping("/stud/{id}")
	public String deletestudent(@PathVariable(value ="id") int id) {
		return studentServiceimpl.deleteStudent(id);
	}

}
