package com.example.student.service;

import com.example.student.model.Student;
import com.example.student.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repo;

    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    public Student save(Student s) { return repo.save(s); }

    public List<Student> findAll() { return repo.findAll(); }

    public void deleteById(Long id) { repo.deleteById(id); }
}
