package com.example.demo.domain;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.infraestructure.CourseTypeRepository;

@Service
public class CourseTypeService {
    @Autowired
    private CourseTypeRepository courseTypeRepository;
    
    
    public CourseType guardarCourseType(CourseType c){
        return courseTypeRepository.save(c);

    }

    public List<CourseType> getAllCoursesTypes(){
        return courseTypeRepository.findAll();
    }

    public Optional<CourseType> getOneCourseType(Long id){
        return courseTypeRepository.findById(id);
    }

}
