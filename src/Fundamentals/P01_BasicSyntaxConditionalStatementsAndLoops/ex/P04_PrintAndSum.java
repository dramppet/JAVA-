package Fundamentals.P01_BasicSyntaxConditionalStatementsAndLoops.ex;

import java.util.Scanner;

public class P04_PrintAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numStart = sc.nextInt();
        int numEnd = sc.nextInt();

        int sum = 0;

        for( int i = numStart; i <= numEnd; i++){
            sum += i;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.printf("Sum: %d",sum);
    }
}
