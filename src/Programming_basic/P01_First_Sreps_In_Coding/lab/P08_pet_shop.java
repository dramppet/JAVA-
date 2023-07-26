package Programming_basic.P01_First_Sreps_In_Coding.lab;

import java.util.Scanner;

public class P08_pet_shop {

    public static double PRICE_FOOD_DOGS = 2.50;
    public static double PRICE_FOOD_CATS = 4;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count_food_dogs = sc.nextInt();
        int count_food_cats = sc.nextInt();

        double total_food = count_food_dogs * PRICE_FOOD_DOGS + count_food_cats * PRICE_FOOD_CATS;

        System.out.println(String.format("%.1f lv.",total_food));



    }
}
