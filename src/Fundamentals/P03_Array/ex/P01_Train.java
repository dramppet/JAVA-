package Fundamentals.P03_Array.ex;

import java.util.Scanner;

public class P01_Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] numbers = new int[size];

        int sumNumbers = 0;

        for (int i = 0; i < numbers.length; i++) {
            int n = sc.nextInt();
            numbers[i] = n;
        }
        for(int i : numbers){
            sumNumbers += i;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(sumNumbers);

    }
}
