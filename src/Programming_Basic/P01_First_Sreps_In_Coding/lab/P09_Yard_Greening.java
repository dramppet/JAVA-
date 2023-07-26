package Programming_Basic.P01_First_Sreps_In_Coding.lab;

import java.util.Scanner;

public class P09_Yard_Greening {
    static double PRICE_ONE_SQUARE = 7.61;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double area_green = sc.nextDouble();

        double priceGreening = area_green * PRICE_ONE_SQUARE;
        double discount = priceGreening * 0.18;
        double total_sum = priceGreening - discount;

        System.out.printf("The final price: %.2f lv.%n",total_sum);
        System.out.printf("The discount: %.2f lv.",discount);
    }
}
