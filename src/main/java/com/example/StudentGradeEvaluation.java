package com.example;

import java.util.Scanner;

public class StudentGradeEvaluation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String grade, name;
        int age, score;
        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        name = scanner.next();
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        System.out.print("Enter your exam score: ");
        score = scanner.nextInt();

        // Prompt the user to enter their age

        // Prompt the user to enter their exam score

        // Determine the grade

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Score: " + score);

        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";

        } else if (score >= 70) {
            grade = "C";

        } else if (score >= 60) {
            grade = "D";

        } else {
            grade = "F";

        }
        System.out.println("Grade: " + grade);

        // Print the student's details

    }
}
