package com.example.school;

import com.example.school.controllers.StudentController;
import com.example.school.controllers.CourseController;
import com.example.school.controllers.TeacherController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentController sc = new StudentController();
        TeacherController tc = new TeacherController();
        CourseController cc = new CourseController();

        // Seed sample data
        tc.createTeacher("John Doe", "Mathematics");
        sc.createStudent("Aline", 21);
        cc.createCourse("Software Engineering", "4 months");

        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== SCHOOL MANAGEMENT ===");
            System.out.println("1. List Students");
            System.out.println("2. Add Student");
            System.out.println("3. List Teachers");
            System.out.println("4. Add Teacher");
            System.out.println("5. List Courses");
            System.out.println("6. Add Course");
            System.out.println("0. Exit");
            System.out.print("Select: ");
            String choice = in.nextLine();

            switch (choice) {
                case "1" -> sc.listStudents();
                case "2" -> {
                    System.out.print("Name: ");
                    String name = in.nextLine();
                    System.out.print("Age: ");
                    int age = Integer.parseInt(in.nextLine());
                    sc.createStudent(name, age);
                }
                case "3" -> tc.listTeachers();
                case "4" -> {
                    System.out.print("Name: ");
                    String name = in.nextLine();
                    System.out.print("Dept: ");
                    String dept = in.nextLine();
                    tc.createTeacher(name, dept);
                }
                case "5" -> cc.listCourses();
                case "6" -> {
                    System.out.print("Title: ");
                    String t = in.nextLine();
                    System.out.print("Duration: ");
                    String d = in.nextLine();
                    cc.createCourse(t, d);
                }
                case "0" -> {
                    System.out.println("Goodbye!");
                    in.close();
                    return;
                }
                default -> System.out.println("Invalid option.");
            }
        }
    }
}