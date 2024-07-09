package com.Liquibase.demo.controller;

import com.Liquibase.demo.entity.Student;
import com.Liquibase.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/student")
    public Student createSchool(@RequestBody Student student){
        return studentService.createSchool(student);
    }

    @GetMapping("/student")
    public List<Student> getSchool(){
        return studentService.getSchool();
    }

    @PutMapping("/student/{id}")
    public Student updateSchool(@PathVariable("id")Long id, @RequestBody Student student){
        return studentService.updateSchool(id,student);
    }

}
