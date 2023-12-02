package com.example.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "course")
@Data
public class Course {
	@Id
	private int courseId;
	
	@Column(name = "course_name", length = 20)
	private String courseName;
	
	@Column(name = "course_mentor", length = 20)
	private String mentor;
	
	@OneToMany(mappedBy = "course")
	List<Student> studentList;

}
