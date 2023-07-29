package Fundamentals.P01_BasicSyntaxConditionalStatementsAndLoops.lab;

import java.util.Scanner;

public class P02_Passed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double grade = sc.nextDouble();

        if (grade >= 3.00){
            System.out.println("Passed!");
        }
    }
}
