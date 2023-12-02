package com.example.model;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "course")
@Data
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long courseId;
	
	@Column(name = "course_name", length = 20)
	private String courseName;
	
	@Column(name = "course_mentor", length = 20)
	private String mentor;
	
	@OneToMany(mappedBy = "course")
	List<Student> studentList;

}
