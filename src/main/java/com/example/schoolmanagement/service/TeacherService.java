package com.example.schoolmanagement.service;

import com.example.schoolmanagement.model.Teacher;
import com.example.schoolmanagement.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public Teacher addTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }


    public Teacher getTeacherById(Long id) {
        Optional<Teacher> teacher = teacherRepository.findById(id);
        if (teacher.isPresent()) {
            return teacher.get();
        } else {
            throw new RuntimeException("Teacher not found with id: " + id);
        }
    }

    public Teacher updateTeacher(Long id, Teacher teacherDetails) {
        Teacher teacher = teacherRepository.findById(id).orElseThrow(() -> new RuntimeException("Teacher not found"));
        teacher.setName(teacherDetails.getName());
        teacher.setEmail(teacherDetails.getEmail());
        return teacherRepository.save(teacher);
    }

    public void deleteTeacher(Long id) {
        teacherRepository.deleteById(id);
    }
}
