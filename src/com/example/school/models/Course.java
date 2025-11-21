package com.example.school.models;

public class Course {
    private String id;
    private String title;
    private String duration;

    public Course(String id, String title, String duration){
        this.id = id;
        this.title = title;
        this.duration = duration;
    }

    public String getId(){ return id; }
    public String getTitle(){ return title; }
    public String getDuration(){ return duration; }

    @Override
    public String toString(){
        return id + " - " + title + " (" + duration + ")";
    }
}
