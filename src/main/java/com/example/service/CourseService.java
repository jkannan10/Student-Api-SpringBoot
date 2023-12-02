package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.Course;

public interface CourseService {
	List<Course> getCourse();

	String saveCourse(Course course);

	String deleteCourse(int id);

	String updateCourse(Course course);
}
