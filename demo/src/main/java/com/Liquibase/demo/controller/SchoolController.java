package com.Liquibase.demo.controller;

import com.Liquibase.demo.entity.School;
import com.Liquibase.demo.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class SchoolController {

    @Autowired
    SchoolService schoolService;

    @PostMapping("/school")
    public School createSchool(@RequestBody School school){
        return schoolService.createSchool(school);
    }

    @GetMapping("/school")
    public List<School> getSchool(){
        return schoolService.getSchool();
    }

    @PutMapping("/school/{id}")
    public School updateSchool(@PathVariable("id")Long id, @RequestBody School school){
        return schoolService.updateSchool(id,school);
    }
}
