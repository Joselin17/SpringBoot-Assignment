package com.cts.student.service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import com.cts.student.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentService implements InitializingBean, DisposableBean {

    private Map<Integer, Student> students = new HashMap<>();

    public void addStudent(Student student) {
        students.put(student.getId(), student);
        System.out.println("Student added: " + student);
    }

    public List<Student> getAllStudents() {
        List<Student> allStudents = new ArrayList<>(students.values());
        System.out.println("All Students: " + allStudents);
        return allStudents;
    }

    public Student getStudentById(int id) {
        Student student = students.get(id);
        System.out.println("Fetched student by ID " + id + ": " + student);
        return student;
    }

    public void updateStudentScore(int id, int newScore) {
        Student student = students.get(id);
        if (student != null) {
            student.setScore(newScore);
            System.out.println("Student score updated: " + student);
            handleScoringSystem(student);
        }
    }

    public void deleteStudent(int id) {
        Student removedStudent = students.remove(id);
        System.out.println("Student removed: " + removedStudent);
    }

    private void handleScoringSystem(Student student) {
        int score = student.getScore();
        if (score < 50) {
            System.out.println("Student is Below Average.");
        } else if (score >= 50 && score <= 75) {
            System.out.println("Student is Average.");
        } else {
            System.out.println("Student is Above Average.");
        }
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("StudentService initialized.");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("StudentService is being destroyed.");
    }
}

