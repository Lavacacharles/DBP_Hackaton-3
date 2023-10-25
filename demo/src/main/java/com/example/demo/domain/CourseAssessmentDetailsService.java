package com.example.demo.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.infraestructure.CourseAssessmentDetailsRepository;

import jakarta.persistence.EntityNotFoundException;

import java.util.*;

@Service
public class CourseAssessmentDetailsService {
    
    @Autowired
    private CourseAssessmentDetailsRepository courseAssessmentDetailsRepository;

    //Para el get

    public List<CourseAssessmentDetails> getAllCourseAsessmentDetails(){
        return courseAssessmentDetailsRepository.findAll();
    }

    //Para el get por id

    public Optional<CourseAssessmentDetails> getOneCourseAsessmentDetails(Long id){
        return courseAssessmentDetailsRepository.findById(id);
    }

    // Para el post
    public CourseAssessmentDetails postCourseAsessmentDetail(CourseAssessmentDetails courseAssessmentDetails){
        return courseAssessmentDetailsRepository.save(courseAssessmentDetails);
    }

    //Para el put
    //¿Como actualizo?
    
    public Optional<CourseAssessmentDetails> pacthCourseAssessmentDetails(Long id, CourseAssessmentDetails courseToPacth){
        Optional<CourseAssessmentDetails> cOptional = courseAssessmentDetailsRepository.findById(id);
        if (cOptional.isPresent()){
            CourseAssessmentDetails courseDetails = cOptional.get();
            courseDetails.setScore(courseToPacth.getScore());
            courseDetails.setSection(courseToPacth.getSection());
            courseDetails.setStudent(courseToPacth.getStudent());            
            courseDetails.setProfesor(courseToPacth.getProfesor());
            courseDetails.setCourseAssessment((courseToPacth.getCourseAssessment()));            
            courseDetails.setSectionGroup(courseToPacth.getSectionGroup());
            courseAssessmentDetailsRepository.save(courseDetails);

        }
        return cOptional;
    }

    //Para el delete: 

   
    public void deleteCourseAssessmentDetails(Long id) {
        CourseAssessmentDetails existingDetails = courseAssessmentDetailsRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Detalles de evaluación de curso no encontrados con ID: " + id));
        courseAssessmentDetailsRepository.delete(existingDetails);
    }

}
