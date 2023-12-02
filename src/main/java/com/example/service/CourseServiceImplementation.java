package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.dao.CourseRepository;
import com.example.model.Course;

public class CourseServiceImplementation implements CourseService {
	@Autowired
	private CourseRepository courseRepository ;
	
	public List<Course> getCourse() {
		List<Course> courseList = null;
		try {
			courseList = courseRepository.findAll();
		}catch(Exception e) {
			e.getMessage();
		}
		return courseList;
	}
	public String saveCourse(Course course) {
		try {
			courseRepository.save(course);
		}catch(Exception e) {
			e.getMessage();
			return "Couldn't add course " ;
		}
		return "Course Added Succesfully ";
	}
	public String deleteCourse(int id) {
		Course c = courseRepository.findById(id).orElse(null);
		if(c == null) {
			return "No course Found ";
		}
		try {
			courseRepository.deleteById(id);
		}catch(Exception e) {
			e.getMessage();
			return "Course can't be deleted " ;
		}
		return "Deleted successfully " ;
		
	}
	public String updateCourse(Course course) {
		try {
			courseRepository.deleteById(course.getCourseId());
			courseRepository.save(course);
		}catch(Exception e) {
			e.getMessage();
			return "can't update course " ;
		}
		return "course updated successfully " ;
	}
}
