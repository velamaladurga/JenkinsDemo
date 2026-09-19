package com.example;

public class App {
    public static void main(String[] args) {

        String studentName = "Durga";

        int math = 85;
        int science = 78;
        int english = 92;
        int computer = 95;
        int social = 80;

        int total = math + science + english + computer + social;
        double average = total / 5.0;

        char grade;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("===== Student Grade Report =====");
        System.out.println("Student: " + studentName);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}