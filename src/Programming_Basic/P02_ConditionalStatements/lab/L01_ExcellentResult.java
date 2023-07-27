package Programming_Basic.P02_ConditionalStatements.lab;

import java.util.Scanner;

public class L01_ExcellentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = sc.nextInt();

        if(result >= 5){
            System.out.println("Excellent!");
        }
    }
}
