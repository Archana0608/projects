package com.example.student.controller;

import com.example.student.model.Student;
import com.example.student.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@CrossOrigin(origins = "*")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping
    public Student save(@RequestBody Student s) {
        return service.save(s);
    }

    @GetMapping
    public List<Student> getAll() {
        return service.findAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteById(id);
    }
}
