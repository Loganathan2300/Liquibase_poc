package com.Liquibase.demo.service;

import com.Liquibase.demo.entity.School;
import com.Liquibase.demo.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SchoolService {
    @Autowired
    SchoolRepository schoolRepository;


    public School createSchool(School school) {
        return schoolRepository.save(school);
    }

    public List<School> getSchool() {
        return schoolRepository.findAll();
    }

    public School updateSchool(Long id, School school) {
        Optional<School> data = schoolRepository.findById(id);
        if (data.isEmpty()) {
            return null;
        }

        School existingSchool = data.get();
        existingSchool.setName(school.getName());
        existingSchool.setAddress(school.getAddress());

        return schoolRepository.save(existingSchool);
    }
}
