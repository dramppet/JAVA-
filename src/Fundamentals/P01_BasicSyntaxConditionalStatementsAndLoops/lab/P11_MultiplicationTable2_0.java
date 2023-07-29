package Fundamentals.P01_BasicSyntaxConditionalStatementsAndLoops.lab;

import java.util.Scanner;

public class P11_MultiplicationTable2_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int start = sc.nextInt();

        if (start > 10){
            System.out.printf("%d X %d = %d",num,start,num*start);
        }

        for (int i = start; i <= 10 ; i++) {
            int product = num * i;
            System.out.printf("%d X %d = %d%n", num,i,product);
        }
    }
}
