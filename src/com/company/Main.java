package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Imprima na Main o nome do professor e seu curso
        Teacher t1 = new Teacher("Teacher 1", "course 1", "123456", 4000.0);
        System.out.println(t1.getName() + " " + t1.getCourse());

        //Calculando o salário do professor
        Teacher t2 = new Teacher("Teacher 2", "course 1", "456789", null);

        System.out.println("Enter how many classes were taught?");
        int classes = sc.nextInt();
        double salary = t2.totalSalary(classes);

        System.out.printf("Total salary: %.2f \n", salary);

        //Calculando média final da aluna
        System.out.println("Enter the first student grade: ");
        double grade1 = sc.nextDouble();
        System.out.println("Enter the second student grade: ");
        double grade2 = sc.nextDouble();

        Student stu1 = new Student();
        stu1.avgCalculate(grade1, grade2);

    }
}
