package com.example.demo.domain;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.infraestructure.CourseRepository;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;
    
    
    public Course guardarCourse(Course c){
        return courseRepository.save(c);

    }

    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }

    public Optional<Course> getOneCourse(Long id){
        return courseRepository.findById(id);
    }

    
}
