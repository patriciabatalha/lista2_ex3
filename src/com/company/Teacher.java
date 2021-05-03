package com.company;

import java.util.List;

public class Teacher {

    private String name;
    private String course;
    private String socialNumber;
    private Double salary;

    private List<String> students;

    public Teacher(){
    }

    public Teacher(String name, String course, String socialNumber, Double salary) {
        this.name = name;
        this.course = course;
        this.socialNumber = socialNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getSocialNumber() {
        return socialNumber;
    }

    public void setSocialNumber(String socialNumber) {
        this.socialNumber = socialNumber;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public List<String> getStudents() {
        return students;
    }

    public void setStudents(List<String> students) {
        this.students = students;
    }

    public Double totalSalary(int classes){
        return classes * 29.0;
    }
}
