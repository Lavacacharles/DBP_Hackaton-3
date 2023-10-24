package com.example.demo.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class CourseType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public CourseType(String name) {
        this.name = name;
    }

    public CourseType() {
    }
}
