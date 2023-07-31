package Fundamentals.P02_DataTypesAndVariables.lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class P03_ExactSumOfRealNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int countNumbers = Integer.parseInt(sc.nextLine());

        BigDecimal sum = new BigDecimal(0);
        while (countNumbers-->0) {
            String numberStr = sc.nextLine();
            BigDecimal number = new BigDecimal(numberStr);
            sum = sum.add(number);
        }
        System.out.println(sum);

    }
}
