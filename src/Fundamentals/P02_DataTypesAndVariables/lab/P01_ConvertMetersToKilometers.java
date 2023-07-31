package Fundamentals.P02_DataTypesAndVariables.lab;

import java.util.Scanner;

public class P01_ConvertMetersToKilometers {
    public static void main(String[] args) {
        int meters = new Scanner(System.in).nextInt();

        System.out.println(String.format("%.2f",(double)meters/1000));
    }
}
