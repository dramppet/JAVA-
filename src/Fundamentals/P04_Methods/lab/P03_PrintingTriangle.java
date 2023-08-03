package Fundamentals.P04_Methods.lab;

import java.util.Scanner;

public class P03_PrintingTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        printingTriangle(size);

    }

    private static void printingTriangle(int sizeTriangle) {
        for (int i = 0; i <= sizeTriangle; i++) {
            printRowOfNumbers(i);
        }

        for (int i = sizeTriangle - 1; i >= 1 ; i--) {
            printRowOfNumbers(i);
        }
    }

    private static void printRowOfNumbers(int lastNumber) {
        for (int i = 1; i <= lastNumber ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
