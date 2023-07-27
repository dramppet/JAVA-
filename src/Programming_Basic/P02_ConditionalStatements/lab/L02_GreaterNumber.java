package Programming_Basic.P02_ConditionalStatements.lab;

import java.util.Scanner;

public class L02_GreaterNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        int second = sc.nextInt();

        System.out.println(Math.max(first,second));
    }
}
