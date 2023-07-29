package Fundamentals.P01_BasicSyntaxConditionalStatementsAndLoops.lab;

import java.util.Scanner;

public class P10_MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 1; i <= 10 ; i++) {
            int product = num * i;
            System.out.printf("%d X %d = %d%n",num,i,product);
        }
    }
}
