package Programming_Basic.P03_ConditionalStatementsAdvanced.lab;

import java.util.Scanner;

public class P011_InvalidNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        boolean isValid = number >= 100 && number <= 200 || number == 0;

        if (!isValid) {
            System.out.println("invalid");
        }
    }
}
