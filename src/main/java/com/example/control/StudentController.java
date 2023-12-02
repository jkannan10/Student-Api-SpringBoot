package com.example.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Course;
import com.example.model.Student;
import com.example.service.CourseService;
import com.example.service.StudentService;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("get")
    public List<Student> getStudentDetails() {
        List<Student> list = studentService.getStudent();
        return list;
    }

    @PostMapping("add")
    public String addStudentDetails(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @PutMapping("update")
    public String updateStudentDetails(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }

    @DeleteMapping("delete")
    public String deleteStudentDetails(@RequestBody Long id) {
        return studentService.deleteStudent(id);
    }


}
