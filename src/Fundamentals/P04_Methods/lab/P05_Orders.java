package Fundamentals.P04_Methods.lab;

import java.util.Scanner;

public class P05_Orders {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String typeOfProducts = sc.nextLine();
        int quantity = Integer.parseInt(sc.nextLine());

        calculateQuantityByProducts(typeOfProducts, quantity);
    }

    private static void calculateQuantityByProducts(String typeOfProducts, int quantity) {
        switch (typeOfProducts) {
            case "coffee":
                System.out.printf(("%.2f"), (double)quantity * 1.5);
                break;
            case "water":
                System.out.printf(("%.2f"), (double)quantity * 1);
                break;
            case "coke":
                System.out.printf(("%.2f"), (double)quantity * 1.4);
                break;
            case "snacks":
                System.out.printf(("%.2f"), (double)quantity * 2);
                break;
        }
    }
}
