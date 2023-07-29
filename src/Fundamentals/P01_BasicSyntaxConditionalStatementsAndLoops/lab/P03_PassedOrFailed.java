package Fundamentals.P01_BasicSyntaxConditionalStatementsAndLoops.lab;

import java.util.Scanner;

public class P03_PassedOrFailed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double grade = sc.nextDouble();

        if (grade >= 3.00){
            System.out.println("Passed!");
        }else {
            System.out.println("Failed!");
        }
    }
}
