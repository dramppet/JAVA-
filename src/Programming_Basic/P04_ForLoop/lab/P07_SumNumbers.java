package Programming_Basic.P04_ForLoop.lab;

import java.util.Scanner;

public class P07_SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countNumber = sc.nextInt();

        int sumNumbers = 0;

        for (int i = 0; i < countNumber; i++) {
            sumNumbers += sc.nextInt();
        }
        System.out.println(sumNumbers);
    }
}
