package Fundamentals.P02_DataTypesAndVariables.lab;

import java.util.Scanner;

public class P04_TownInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String town = sc.nextLine();
        int population = Integer.parseInt(sc.nextLine());
        int area = Integer.parseInt(sc.nextLine());

        System.out.printf("Town %s has population of %d and area %d square km.",town,population,area);
    }
}
