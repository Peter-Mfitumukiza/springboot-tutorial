package com.example.springDemo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {
    private final StudentService studentService;
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents(){
       return this.studentService.getStudents();
    }
    @PostMapping
    public void addStudent(@RequestBody Student student){
        this.studentService.addNewStudent(student);
    }
    @DeleteMapping(path="{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long id){
        studentService.deleteStudent(id);
    }
}

