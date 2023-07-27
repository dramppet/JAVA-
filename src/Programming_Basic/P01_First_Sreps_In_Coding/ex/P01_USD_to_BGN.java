package Programming_Basic.P01_First_Sreps_In_Coding.ex;

import java.util.Scanner;

public class P01_USD_to_BGN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double price_usd = sc.nextDouble();

        System.out.println(price_usd * 1.79549);
    }
}
