package com.example.school.services;

import com.example.school.models.Teacher;
import com.example.school.database.Database;

import java.util.UUID;
import java.util.List;

public class TeacherService {
    public Teacher create(String name, String department){
        String id = "T-" + UUID.randomUUID().toString().substring(0,8);
        Teacher t = new Teacher(id, name, department);
        Database.teachers.add(t);
        return t;
    }

    public List<Teacher> all(){
        return Database.teachers;
    }
}