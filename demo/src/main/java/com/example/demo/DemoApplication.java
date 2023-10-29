package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.domain.Course;
import com.example.demo.domain.CourseAssessment;
import com.example.demo.domain.CourseAssessmentDetails;
import com.example.demo.domain.CourseType;
import com.example.demo.domain.Periodo;
import com.example.demo.domain.Profesor;
import com.example.demo.domain.Student;
import com.example.demo.infraestructure.CourseAssessmentDetailsRepository;
import com.example.demo.infraestructure.CourseAssessmentRepository;
import com.example.demo.infraestructure.CourseRepository;
import com.example.demo.infraestructure.CourseTypeRepository;
import com.example.demo.infraestructure.PeriodoRepository;
import com.example.demo.infraestructure.ProfessorRepository;
import com.example.demo.infraestructure.StudentRepository;

@SpringBootApplication
public class DemoApplication /*implements CommandLineRunner*/ {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired 
	private CourseAssessmentDetailsRepository courseAssessmentDetailsRepository;

	@Autowired
	private CourseRepository courseRepository;

	@Autowired
	private CourseTypeRepository courseTypeRepository;

	@Autowired
	private PeriodoRepository periodoRepository;

	@Autowired
	private CourseAssessmentRepository courseAssessmentRepository;

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private ProfessorRepository professorRepository ;

	/*@Override
	public void run(String... args) throws Exception {

		//coursetype: 
		CourseType courseType = new CourseType();
		courseType.setName("Tipo de Curso"); 
		courseTypeRepository.save(courseType);
		//Course: 
		Course course = new Course();
		course.setName("Nombre del Curso");
		course.setCredits(3); // Establece la cantidad de créditos
		course.setCourseContent("Contenido del Curso");
		course.setCode("ABC123");
		course.setArea("Informática");
		course.setHRGroup("Grupo A");
		course.setVRGroup("Grupo B");
		course.setCycle(2); // Establece el ciclo
		course.setCourseType(courseType);
		courseRepository.save(course);
		//	Periodo
		Periodo periodo = new Periodo();
		periodo.setName("Nombre del Periodo");
		periodo.setCode("Código del Periodo");
		periodoRepository.save(periodo);
		//courseAssessment
		CourseAssessment courseAssessment = new CourseAssessment();
		courseAssessment.setTitle("Título del Curso de Evaluación");
		courseAssessment.setTipoNota("Tipo de Nota");
		courseAssessment.setNumNota("Número de Nota");
		courseAssessment.setNomenclatura("Nomenclatura de la Nota");
		courseAssessment.setCourse(course);
		courseAssessment.setPeriodo(periodo);
		courseAssessmentRepository.save(courseAssessment);
		//Student
		Student student = new Student();
		student.setName("Nombre del Estudiante");
		student.setEmail("estudiante@example.com");
		student.setCode("202220318");
		student.setArea("Area");
		studentRepository.save(student);

		//Porfesor

		Profesor profesor = new Profesor();
		profesor.setName("Nombre del Profesor");
		profesor.setLastName("Apellido del Profesor");
		profesor.setEmail("profesor@example.com");
		profesor.setFullName("Nombre del profe completico");
		professorRepository.save(profesor);

		//CourseAssessmentDetails
		CourseAssessmentDetails courseDetails = new CourseAssessmentDetails();
		courseDetails.setScore("A");
		courseDetails.setSection("Sección 1");
		courseDetails.setSectionGroup("Grupo A");
		courseDetails.setStudent(student);
		courseDetails.setProfesor(profesor);
		courseDetails.setCourseAssessment(courseAssessment);

		courseAssessmentDetailsRepository.save(courseDetails);
	

		
	}*/

}
