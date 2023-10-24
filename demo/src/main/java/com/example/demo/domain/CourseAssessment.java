package com.example.demo.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor(staticName = "build")
@Table(name = "coursesassessment")
public class CourseAssessment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tittle;
    private String tipoNota;
    private String numNota;
    private String nomenclatura;

    @OneToMany
    @JoinColumn(name = "periodo_id")
    private Periodo periodo;

    @OneToMany
    @JoinColumn(name = "course_id")
    private Course course;   

    
}