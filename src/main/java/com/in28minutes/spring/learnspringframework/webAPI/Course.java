package com.in28minutes.spring.learnspringframework.webAPI;

public class Course {
    private long id;
    private String name;
    private String author;

    public Course(int i, String name, String author) {
        this.id = i;
        this.name = name;
        this.author = author;
    }

    public String toString() {
        return "Course [id=" + id + ", name=" + name + ", author=" + author +"]";
    }

    public long getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }
    public String getName(){
        return name;
    }
}
