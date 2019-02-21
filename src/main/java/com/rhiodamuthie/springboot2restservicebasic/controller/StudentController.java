package com.rhiodamuthie.springboot2restservicebasic.controller;

import com.rhiodamuthie.springboot2restservicebasic.model.Student;
import com.rhiodamuthie.springboot2restservicebasic.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;



}