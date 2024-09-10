package com.example.schoolmanagement.controller;

import com.example.schoolmanagement.model.Class;
import com.example.schoolmanagement.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/classes")
public class ClassController {

    @Autowired
    private ClassService classService;

    @PostMapping
    public Class addClass(@RequestBody Class classData) {
        return classService.addClass(classData);
    }

    @GetMapping
    public List<Class> getAllClasses() {
        return classService.getAllClasses();
    }

    @PutMapping("/{id}")
    public Class updateClass(@PathVariable Long id, @RequestBody Class classDetails) {
        return classService.updateClass(id, classDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteClass(@PathVariable Long id) {
        classService.deleteClass(id);
    }
}
