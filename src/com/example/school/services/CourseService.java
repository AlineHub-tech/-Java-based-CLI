package com.example.school.services;

import com.example.school.models.Course;
import com.example.school.database.Database;

import java.util.UUID;
import java.util.List;

public class CourseService {
    public Course create(String title, String duration){
        String id = "C-" + UUID.randomUUID().toString().substring(0,8);
        Course c = new Course(id, title, duration);
        Database.courses.add(c);
        return c;
    }

    public List<Course> all(){
        return Database.courses;
    }
}
