package Fundamentals.P02_DataTypesAndVariables.lab;

import java.util.Scanner;

public class P10_SpecialNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        for (int num = 1; num <= number; num++) {
            int sumOfDigit = 0;
            int digits = num;
            while (digits > 0) {
                sumOfDigit += digits % 10;
                digits = digits / 10;
            }
            if (sumOfDigit == 5 || sumOfDigit == 7 || sumOfDigit == 11) {
                System.out.println(num + " -> True");
            } else {
                System.out.println(num + " -> False");

            }
        }
    }
}
