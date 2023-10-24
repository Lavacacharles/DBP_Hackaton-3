package com.example.demo.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.CourseType;
import com.example.demo.domain.CourseTypeService;

@RestController
@RequestMapping("/coursetype")
public class CourseTypeController {
    @Autowired
    private CourseTypeService courseTypeService;

    @PostMapping
    public CourseType PostCourse(@RequestBody CourseType cursoType){
        return courseTypeService.guardarCourseType(cursoType);
    }

    @GetMapping
    public List<CourseType> GetAllCoursesTypes(){
        return courseTypeService.getAllCoursesTypes();
    }

    @GetMapping("/{id}")
    public CourseType getCursoType(@PathVariable Long id){
        return courseTypeService.getOneCourseType(id).get();
    }
}
