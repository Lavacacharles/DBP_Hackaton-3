package com.example.demo.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
@Table(name = "coursesassessmentdetails")
public class CourseAssessmentDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String score;
    private String section;
    private String sectionGroup;

    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "profesor_id")
    private Profesor profesor;

    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "courseassessment_id")
    private CourseAssessment courseAssessment;
    
}
