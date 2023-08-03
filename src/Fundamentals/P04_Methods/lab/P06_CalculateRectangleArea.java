package Fundamentals.P04_Methods.lab;

import java.util.Scanner;

public class P06_CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double width = Double.parseDouble(sc.nextLine());
        double height = Double.parseDouble(sc.nextLine());

        System.out.printf("%.0f",calculateRectangle(width,height));
    }

    private static double calculateRectangle(double width, double height) {
        return width * height;
    }
}
