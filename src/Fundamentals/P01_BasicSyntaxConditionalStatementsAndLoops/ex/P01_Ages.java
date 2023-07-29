package Fundamentals.P01_BasicSyntaxConditionalStatementsAndLoops.ex;

import java.util.Scanner;

public class P01_Ages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        String output = "";

        if (age <= 2){
            output = "baby";
        } else if (age <= 13) {
            output = "child";
        } else if (age <= 19) {
            output = "teenager";
        } else if (age <= 65) {
            output = "adult";
        }else {
            output = "elder";
        }
        System.out.println(output);
    }
}
