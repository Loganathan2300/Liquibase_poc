package com.Liquibase.demo.service;

import com.Liquibase.demo.entity.School;
import com.Liquibase.demo.entity.Student;
import com.Liquibase.demo.repository.SchoolRepository;
import com.Liquibase.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Autowired
    SchoolRepository schoolRepository;

    public Student createSchool(Student student) {
        Long schoolId = student.getSchool().getId();
        School school = schoolRepository.findById(schoolId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid school ID: " + schoolId));
        student.setSchool(school);
        return studentRepository.save(student);
    }

    public List<Student> getSchool() {
        return studentRepository.findAll();
    }

    public Student updateSchool(Long id, Student student) {
        Optional<Student> studentData = studentRepository.findById(id);
        if (studentData.isEmpty()) {
            return null;
        }

        Student existingStudent = studentData.get();
        existingStudent.setSchool(student.getSchool());
        existingStudent.setName(student.getName());
        existingStudent.setAddress(student.getAddress());
        existingStudent.setEmail(student.getEmail());

        return studentRepository.save(existingStudent);
    }
}
