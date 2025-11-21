package com.example.school.controllers;

import com.example.school.services.StudentService;
import com.example.school.models.Student;

import java.util.List;

public class StudentController {
    private final StudentService service = new StudentService();

    public Student createStudent(String name, int age){
        Student s = service.create(name, age);
        System.out.println("[Student Created] " + s);
        return s;
    }

    public void listStudents(){
        List<Student> list = service.all();
        System.out.println("=== Students ===");
        if (list.isEmpty()) {
            System.out.println("No students yet.");
            return;
        }
        for (Student s : list){
            System.out.println(s);
        }
    }
}