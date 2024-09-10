package com.example.schoolmanagement.service;

import com.example.schoolmanagement.model.Class;
import com.example.schoolmanagement.repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassService {

    @Autowired
    private ClassRepository classRepository;

    public Class addClass(Class classData) {
        return classRepository.save(classData);
    }

    public List<Class> getAllClasses() {
        return classRepository.findAll();
    }

    public Class updateClass(Long id, Class classDetails) {
        Class classData = classRepository.findById(id).orElseThrow(() -> new RuntimeException("Class not found"));
        classData.setName(classDetails.getName());
        return classRepository.save(classData);
    }

    public void deleteClass(Long id) {
        classRepository.deleteById(id);
    }
}
