package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.model.Course;

@EnableJpaRepositories
@Repository
public interface CourseRepository extends JpaRepository<Course , Long> {

}
