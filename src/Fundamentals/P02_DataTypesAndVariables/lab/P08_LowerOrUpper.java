package Fundamentals.P02_DataTypesAndVariables.lab;

import java.util.Scanner;

public class P08_LowerOrUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char symbols = sc.nextLine().charAt(0);

        if (Character.isUpperCase(symbols)){
            System.out.println("upper-case");
        }else {
            System.out.println("lower-case");
        }
    }
}
