package com.example.school.controllers;

import com.example.school.services.TeacherService;
import com.example.school.models.Teacher;

import java.util.List;

public class TeacherController {
    private final TeacherService service = new TeacherService();

    public Teacher createTeacher(String name, String dept){
        Teacher t = service.create(name, dept);
        System.out.println("[Teacher Created] " + t);
        return t;
    }

    public void listTeachers(){
        List<Teacher> list = service.all();
        System.out.println("=== Teachers ===");
        if (list.isEmpty()) {
            System.out.println("No teachers yet.");
            return;
        }
        for (Teacher t : list){
            System.out.println(t);
        }
    }
}