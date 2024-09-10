package com.example.schoolmanagement.controller;

import com.example.schoolmanagement.model.Subject;
import com.example.schoolmanagement.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subjects")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @PostMapping
    public Subject addSubject(@RequestBody Subject subject) {
        return subjectService.addSubject(subject);
    }

    @GetMapping
    public List<Subject> getAllSubjects() {
        return subjectService.getAllSubjects();
    }

    @PutMapping("/{id}")
    public Subject updateSubject(@PathVariable Long id, @RequestBody Subject subjectDetails) {
        return subjectService.updateSubject(id, subjectDetails);
    }

    @GetMapping("/{id}")
    public Subject getSubjectById(@PathVariable Long id) {
        return subjectService.getSubjectById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteSubject(@PathVariable Long id) {
        subjectService.deleteSubject(id);
    }
}
