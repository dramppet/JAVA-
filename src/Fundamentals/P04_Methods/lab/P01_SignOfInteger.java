package Fundamentals.P04_Methods.lab;

import java.util.Scanner;

public class P01_SignOfInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        System.out.println(DifferentSign(number));
    }
    public static String DifferentSign(int input){
        if (input > 0){
            return "The number " + input + " is positive.";
        } else if (input < 0) {
            return"The number " + input + " is negative.";
        }else {
            return "The number 0 is zero.";
        }
    }

}
