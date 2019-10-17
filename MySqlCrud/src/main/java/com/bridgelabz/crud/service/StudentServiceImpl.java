
package com.bridgelabz.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.crud.model.Student;
import com.bridgelabz.crud.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}

	@Override
	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudent(int id) {
		return  studentRepository.findById(id).orElse(null);
	}

	@Override
	public Student updateStudent(int id, Student student) {
		Student stu= studentRepository.findById(id).orElse(null);
		stu.setName(student.getName());
		stu.setAddress(student.getAddress());
		return studentRepository.save(stu);
	}

	@Override
	public String deleteStudent(int id) {
		studentRepository.deleteById(id);
		return "student deleted";
	}

}
