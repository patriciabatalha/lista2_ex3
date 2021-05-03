package com.company;

public class Student {

    private String name;
    private double grade1;
    private double grade2;

    public Student() {
    }

    public Student(String name, double grade1, double grade2) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade1() {
        return grade1;
    }

    public void setGrade1(double grade1) {
        this.grade1 = grade1;
    }

    public double getGrade2() {
        return grade2;
    }

    public void setGrade2(double grade2) {
        this.grade2 = grade2;
    }

    public double avgCalculate(double grade1, double grade2) {
        double average = (grade1 + grade2) / 2;
        if (average < 7.0) {
            System.out.printf("Your final grade is: %.2f \n", average);
            System.out.println("Sorry, you were reproved!");
        } else {
            System.out.printf("Your final grade is: %.2f \n", average);
            System.out.println("Congrats, you were approved! Enjoy your vacations!");
        }
        return average;
    }

}
