package com.example.schoolmanagement.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
@Table(name = "class")
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany
    @JoinTable(
            name = "class_student",
            joinColumns = @JoinColumn(name = "class_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id"))
    private List<Student> students;

    @OneToMany(mappedBy = "classData", cascade = CascadeType.ALL)  // Use 'classData' instead of 'class'
    private List<Subject> subjects;
}
