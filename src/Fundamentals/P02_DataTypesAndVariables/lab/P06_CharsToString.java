package Fundamentals.P02_DataTypesAndVariables.lab;

import java.util.Scanner;

public class P06_CharsToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char firstChar = sc.nextLine().charAt(0);
        char secondChar = sc.nextLine().charAt(0);
        char thirdChar = sc.nextLine().charAt(0);

        System.out.println(String.format("%c%c%c",firstChar,secondChar,thirdChar));
    }
}
