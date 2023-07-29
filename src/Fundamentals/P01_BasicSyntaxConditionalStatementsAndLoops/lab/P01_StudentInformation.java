package Fundamentals.P01_BasicSyntaxConditionalStatementsAndLoops.lab;

import java.util.Scanner;

public class P01_StudentInformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String studentName = sc.nextLine();
        int studentAge = Integer.parseInt(sc.nextLine());
        double gradeStudent = Double.parseDouble(sc.nextLine());

        System.out.printf("Name: %s, Age: %d, Grade: %.2f",studentName,studentAge,gradeStudent);
    }
}
