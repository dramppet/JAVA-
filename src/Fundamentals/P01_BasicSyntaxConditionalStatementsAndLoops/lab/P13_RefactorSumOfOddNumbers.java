package Fundamentals.P01_BasicSyntaxConditionalStatementsAndLoops.lab;

import java.util.Scanner;

public class P13_RefactorSumOfOddNumbers {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        int sum = 0;

        for (int i = 1; i < n * 2; i+=2) {
            sum += i;
            System.out.println(i);
        }
        System.out.printf("Sum: %d",sum);
    }
}
