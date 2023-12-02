package com.example.control;

import com.example.model.Course;
import com.example.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("course")
public class CourseController {

    @Autowired
    private CourseService courseService;
    @GetMapping("get")
    public List<Course> getCourseDetails() {
        List<Course> list = courseService.getCourse();
        return list;
    }

    @PostMapping("add")
    public String addCourseDetails(@RequestBody Course course) {
        return courseService.saveCourse(course);
    }

    @PutMapping("update")
    public String updateCourseDetails(@RequestBody Course course) {
        return courseService.updateCourse(course);
    }

    @DeleteMapping("delete")
    public String deleteCourseDetails(@RequestBody Long id) {
        return courseService.deleteCourse(id);
    }
}
