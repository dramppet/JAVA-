package Fundamentals.P03_Array.ex;

import java.util.Scanner;

public class P04_ArrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");
        int rotation = sc.nextInt();

        for (int i = 0; i < rotation % input.length; i++) {
            String current = input[0];
            for (int j = 0; j < input.length - 1; j++) {
                input[j] = input[j + 1];
            }
            input[input.length - 1] = current;
        }

        System.out.println(String.join(" ", input));
    }
}
