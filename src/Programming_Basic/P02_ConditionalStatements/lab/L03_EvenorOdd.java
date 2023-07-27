package Programming_Basic.P02_ConditionalStatements.lab;

import java.util.Scanner;

public class L03_EvenorOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number % 2 == 0){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
    }
}
