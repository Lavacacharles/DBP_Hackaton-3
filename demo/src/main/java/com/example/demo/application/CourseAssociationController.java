package com.example.demo.application;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.Course;
import com.example.demo.domain.CourseType;
import com.example.demo.infraestructure.CourseRepository;
import com.example.demo.infraestructure.CourseTypeRepository;

@RestController
@RequestMapping("/Enrrolment")
public class CourseAssociationController {
    @Autowired
	private CourseRepository courseRepository;

	@Autowired
	private CourseTypeRepository courseTypeRepository;

    @PostMapping("/{id_course}/{id_course_type}")
    public ResponseEntity<String> asociando(@PathVariable Long id_course, @PathVariable Long id_course_type ){
        Optional<Course> course = courseRepository.findById(id_course);        
        Optional<CourseType> coursetype = courseTypeRepository.findById(id_course_type);

        course.get().setCourseType(coursetype.get());
        courseRepository.save(course.get());
        return ResponseEntity.status(HttpStatus.CREATED).body("Curso Asociado correctamente");



    }
    
}
