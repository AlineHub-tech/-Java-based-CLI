package com.example.school.services;

import com.example.school.models.Student;
import com.example.school.database.Database;

import java.util.UUID;
import java.util.List;

public class StudentService {
    public Student create(String name, int age){
        String id = "S-" + UUID.randomUUID().toString().substring(0,8);
        Student s = new Student(id, name, age);
        Database.students.add(s);
        return s;
    }

    public List<Student> all(){
        return Database.students;
    }
}