package Fundamentals.P04_Methods.lab;

import java.util.Scanner;

public class P02_Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double grades = Double.parseDouble(sc.nextLine());

        System.out.println(TypeGrades(grades));
    }

    public static String TypeGrades(double input) {
        if (input >= 2.00 && input <= 2.99) {
            return "Fail";
        } else if (input >= 3.00 && input <= 3.49) {
            return "Poor";
        } else if (input >= 3.50 && input <= 4.49) {
            return "Good";
        } else if (input >= 4.50 && input <= 5.49) {
            return "Very good";
        } else{
            return "Excellent";
        }
    }
}
