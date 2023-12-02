package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.StudentRepository;
import com.example.model.Student;

@Service
public class StudentServiceImplementation implements StudentService {
	@Autowired
	private StudentRepository studentRepository;

	public List<Student> getStudent() {
		List<Student> list = studentRepository.findAll();
		return list;
	}

	public String saveStudent(Student student) {
		try {

			studentRepository.save(student);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return "Saved Successfully ";
	}

	public String deleteStudent(int id) {
		Student s = studentRepository.findById(id).orElse(null);
		if (s == null) {
			return "No such Student exists ";
		}
		try {

			studentRepository.deleteById(id);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return "Can't able to delete the student ";
		}
		return "Deleted Successfully";
	}

	public String updateStudent(Student student) {
		Student s = studentRepository.findById(student.getId()).orElse(null);
		if (s == null) {
			return "No such Student exists ";
		}
		s.setId(student.getId());
		s.setName(student.getName());
		s.setAge(student.getAge());
		s.setMobileNumber(student.getMobileNumber());
		try {

			studentRepository.save(student);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return "Updated Successfully ";
	}

}
