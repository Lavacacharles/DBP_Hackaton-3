package com.example.demo.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Course {
    
    private String name;

    private Integer credits;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 

    private String courseContent;

    private String code;

    private String area;

    private String HRGroup;

    private Integer cycle;    
    
    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "courseType_id")
    private CourseType courseType;

    private String VRGroup;

   
    public Course() {
    }






}
