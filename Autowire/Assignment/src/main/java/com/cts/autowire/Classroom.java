package com.cts.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Classroom {
	private final Student student;

	    @Autowired
	    public Classroom(Student student) {
	        this.student = student;
	    }

	    public void displayStudentDetails() {
	        System.out.println("Student Name: " + student.getName());
	        System.out.println("Student Age: " + student.getAge());
	    }

}
