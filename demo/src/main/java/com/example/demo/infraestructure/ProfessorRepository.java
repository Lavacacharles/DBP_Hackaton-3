package com.example.demo.infraestructure;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Profesor;

public interface ProfessorRepository extends JpaRepository<Profesor,Long> {
    
}
