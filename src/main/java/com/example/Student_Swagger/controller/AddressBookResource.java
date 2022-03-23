package com.example.Student_Swagger.controller;

import com.example.Student_Swagger.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@RestController
//@RequestMapping("/api")
public class AddressBookResource {
    ConcurrentMap<String, Student> students = new ConcurrentHashMap<>();

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable String id){
        return students.get(id);
    }

    @GetMapping("/")
    public List<Student> getAllStudents(){
        return new ArrayList<Student>(students.values());
    }

    @PostMapping("/")
    public Student addStudent(@RequestBody Student student){
        students.put(student.getId(),student);
        return student;
    }












}
