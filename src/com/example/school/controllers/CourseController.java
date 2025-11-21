package com.example.school.controllers;

import com.example.school.services.CourseService;
import com.example.school.models.Course;

import java.util.List;

public class CourseController {
    private final CourseService service = new CourseService();

    public Course createCourse(String title, String duration){
        Course c = service.create(title, duration);
        System.out.println("[Course Created] " + c);
        return c;
    }

    public void listCourses(){
        List<Course> list = service.all();
        System.out.println("=== Courses ===");
        if (list.isEmpty()) {
            System.out.println("No courses yet.");
            return;
        }
        for (Course c : list){
            System.out.println(c);
        }
    }
}
