package com.example.schoolmanagement.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;

    @ManyToMany(mappedBy = "students")
    private List<Class> classes;
}
