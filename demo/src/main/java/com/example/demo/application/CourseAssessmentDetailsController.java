package com.example.demo.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.CourseAssessmentDetails;
import com.example.demo.domain.CourseAssessmentDetailsService;

@RestController
@RequestMapping("/course_assessment_details")
public class CourseAssessmentDetailsController {
    

    @Autowired
    private CourseAssessmentDetailsService courseAssessmentDetailsService;

    @GetMapping
    public ResponseEntity<List<CourseAssessmentDetails>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(courseAssessmentDetailsService.getAllCourseAsessmentDetails());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CourseAssessmentDetails> getOne(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(courseAssessmentDetailsService.getOneCourseAsessmentDetails(id).get());
    }

    @PostMapping
    public ResponseEntity<String> post(@RequestBody CourseAssessmentDetails courseD){
        courseAssessmentDetailsService.postCourseAsessmentDetail(courseD);
        return ResponseEntity.status(HttpStatus.CREATED).body("new item created");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> actualizar(@PathVariable Long id, @RequestBody CourseAssessmentDetails course ){
        courseAssessmentDetailsService.pacthCourseAssessmentDetails(id,course);
        return ResponseEntity.status(HttpStatus.OK).body("item " + id.toString()+" updated"); 
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminar(@PathVariable Long id){
        courseAssessmentDetailsService.deleteCourseAssessmentDetails(id);
        return ResponseEntity.status(HttpStatus.OK).body("item " + id.toString()+" deleted");
    }









}
