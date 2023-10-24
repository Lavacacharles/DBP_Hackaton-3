package com.example.demo.application;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.Course;
import com.example.demo.domain.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {
    
    @Autowired
    private CourseService courseService;

    @PostMapping
    public Course PostCourse(@RequestBody Course curso){
        return courseService.guardarCourse(curso);
    }

    @GetMapping
    public List<Course> GetAllCourses(){
        return courseService.getAllCourses();
    }

    @GetMapping("/{id}")
    public Course getCurso(@PathVariable Long id){
        return courseService.getOneCourse(id).get();
    }
}
