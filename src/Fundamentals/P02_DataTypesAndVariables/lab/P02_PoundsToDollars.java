package Fundamentals.P02_DataTypesAndVariables.lab;

import java.util.Scanner;

public class P02_PoundsToDollars {

    static double ONE_BRITISH_POUND = 1.36;
    public static void main(String[] args) {

        double britishPounds = new Scanner(System.in).nextDouble();

        System.out.printf("%.3f",britishPounds*ONE_BRITISH_POUND);
    }
}
