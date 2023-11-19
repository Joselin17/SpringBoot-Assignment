package com.cts.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cts.student.service.StudentService;


@SpringBootApplication
public class StudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
		
		// Demonstrate usage of StudentService
        StudentService studentService = new StudentService();

        Student student1 = new Student(1, "John", 80);
        Student student2 = new Student(2, "Sheeba", 45);

        //add students
        studentService.addStudent(student1);
        studentService.addStudent(student2);
        
        //fetch the student by id 
        studentService.getStudentById(2);

        //update the student score
        studentService.updateStudentScore(1, 90);

        //delete student
        studentService.deleteStudent(1);
	}

}
