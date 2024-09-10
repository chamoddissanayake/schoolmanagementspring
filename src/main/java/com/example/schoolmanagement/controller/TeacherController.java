package com.example.schoolmanagement.controller;

import com.example.schoolmanagement.model.Teacher;
import com.example.schoolmanagement.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
//@RequestMapping("/teachers")
//public class TeacherController {
//
//    @Autowired
//    private TeacherService teacherService;
//
//    @PostMapping
//    public Teacher addTeacher(@RequestBody Teacher teacher) {
//        return teacherService.addTeacher(teacher);
//    }
//
//    @GetMapping
//    public List<Teacher> getAllTeachers() {
//        return teacherService.getAllTeachers();
//    }
//
//    @PutMapping("/{id}")
//    public Teacher updateTeacher(@PathVariable Long id, @RequestBody Teacher teacherDetails) {
//        return teacherService.updateTeacher(id, teacherDetails);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteTeacher(@PathVariable Long id) {
//        teacherService.deleteTeacher(id);
//    }
//}


@RestController
@RequestMapping("/teachers")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @PostMapping
    public Teacher createTeacher(@RequestBody Teacher teacher) {
        return teacherService.addTeacher(teacher);
    }

    @GetMapping
    public List<Teacher> getAllTeachers() {
        return teacherService.getAllTeachers();
    }

    @GetMapping("/{id}")
    public Teacher getTeacherById(@PathVariable Long id) {
        return teacherService.getTeacherById(id);
    }

    @PutMapping("/{id}")
    public Teacher updateTeacher(@PathVariable Long id, @RequestBody Teacher teacher) {
        return teacherService.updateTeacher(id, teacher);
    }

    @DeleteMapping("/{id}")
    public void deleteTeacher(@PathVariable Long id) {
        teacherService.deleteTeacher(id);
    }
}
