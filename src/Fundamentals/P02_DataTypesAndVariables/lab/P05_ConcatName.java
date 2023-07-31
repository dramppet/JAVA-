package Fundamentals.P02_DataTypesAndVariables.lab;

import java.util.Scanner;

public class P05_ConcatName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        String delimiter = sc.nextLine();

        System.out.printf("%s%s%s",firstName,delimiter,lastName);
    }
}
