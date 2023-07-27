package Programming_Basic.P02_ConditionalStatements.lab;

import java.util.Scanner;

public class L05_Number100to200 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number < 100){
            System.out.println("Less than 100");
        } else if (number <= 200) {
            System.out.println("Between 100 and 200");
        }else {
            System.out.println("Greater than 200");
        }
    }
}
