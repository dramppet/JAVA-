package Fundamentals.P03_Array.lab;

import java.util.Scanner;

public class P02_PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = Integer.parseInt(sc.nextLine());

        int[] numbers = new int[size];

        for(int i = 0; i < numbers.length; ++i){
            int n = Integer.parseInt(sc.nextLine());
            numbers[i] = n;
        }

        for(int i = numbers.length - 1; i >= 0; i--){
            System.out.println(numbers[i]);
        }
    }
}
