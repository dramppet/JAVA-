package Fundamentals.P01_BasicSyntaxConditionalStatementsAndLoops.lab;

import java.util.Scanner;
import java.util.TreeMap;

public class P12_EvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            int num = Math.abs(Integer.parseInt(sc.nextLine()));

            if (num % 2 == 0){
                System.out.printf("The number is: %d",num);
                break;
            }else {
                System.out.println("Please write an even number.");
            }
        }
    }
}
