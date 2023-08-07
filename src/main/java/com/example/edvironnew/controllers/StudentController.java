package com.example.edvironnew.controllers;

import com.example.edvironnew.entities.StudentEntity;
import com.example.edvironnew.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public ResponseEntity<List<StudentEntity>> getStudents(){
        List<StudentEntity> studentEntityList = studentService.getStudents();
        return ResponseEntity.ok(studentEntityList);
    }

    @GetMapping("/students/{name}")
    public ResponseEntity<Integer> getStudentsSize(@PathVariable String name){
        Integer studentsSize = studentService.getStudentsSize(name);
        return ResponseEntity.ok(studentsSize);
    }
}
