package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.Student;

@Service
public interface StudentService {
	List<Student> getStudent();

	String saveStudent(Student student);

	String deleteStudent(Long id);

	String updateStudent(Student student);

}
