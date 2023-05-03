package com.hdfc.data.poc.data.migration.controller;

import com.hdfc.data.poc.data.migration.oracle.entity.College;
import com.hdfc.data.poc.data.migration.oracle.repository.CollegeRepository;
import com.hdfc.data.poc.data.migration.postgres.entity.Student;
import com.hdfc.data.poc.data.migration.postgres.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {
    private final StudentRepository studentRepository;
    private final CollegeRepository collegeRepository;


    @PostMapping("/students")
    public ResponseEntity<?> createStudent(@RequestBody Student student) {
        return new ResponseEntity<>(studentRepository.save(student), HttpStatus.CREATED);
    }

    @PostMapping("/colleges")
    public ResponseEntity<?> createCollege(@RequestBody College college) {
        return new ResponseEntity<>(collegeRepository.save(college), HttpStatus.CREATED);
    }

    @GetMapping("/students")
    public ResponseEntity<?> getStudents() {
        return new ResponseEntity<>(studentRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/colleges")
    public ResponseEntity<?> getColleges() {
        return new ResponseEntity<>(collegeRepository.findAll(), HttpStatus.OK);
    }
}
