package com.example.schoolmanagement.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "class_id")
    private Class classData;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;
}
