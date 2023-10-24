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
    
    @ManyToOne
    @JoinColumn(name = "courseType_id")
    private CourseType courseType;

    private String VRGroup;

    public Course(String name, Integer credits, String courseContent, String code, String area, String hRGroup,
            Integer cycle, String vRGroup) {
        this.name = name;
        this.credits = credits;
        this.courseContent = courseContent;
        this.code = code;
        this.area = area;
        HRGroup = hRGroup;
        this.cycle = cycle;
        VRGroup = vRGroup;
    }

    public Course(String name, Integer credits, String courseContent, String code, String area, String hRGroup,
            Integer cycle, CourseType courseType, String vRGroup) {
        this.name = name;
        this.credits = credits;
        this.courseContent = courseContent;
        this.code = code;
        this.area = area;
        HRGroup = hRGroup;
        this.cycle = cycle;
        this.courseType = courseType;
        VRGroup = vRGroup;
    }

    public Course() {
    }






}
