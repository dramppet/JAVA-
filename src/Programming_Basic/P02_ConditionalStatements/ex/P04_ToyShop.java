package Programming_Basic.P02_ConditionalStatements.ex;

import java.util.Scanner;

public class P04_ToyShop {
    static double PRICE_PUZZLE = 2.60;
    static double PRICE_DOLL = 3.00;
    static double PRICE_TEDDY_BEAR = 4.10;
    static double PRICE_MINION = 8.20;
    static double PRICE_TRUCK = 2.00;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double priceTrip = Double.parseDouble(sc.nextLine());
        int countPuzzles = Integer.parseInt(sc.nextLine());
        int countDoll = Integer.parseInt(sc.nextLine());
        int countTeddyBear = Integer.parseInt(sc.nextLine());
        int countMinion = Integer.parseInt(sc.nextLine());
        int countTruck = Integer.parseInt(sc.nextLine());

        double sumAllToy = countPuzzles * PRICE_PUZZLE + countDoll * PRICE_DOLL
                + countTeddyBear * PRICE_TEDDY_BEAR + countMinion * PRICE_MINION
                + countTruck * PRICE_TRUCK;
        int countToy = countPuzzles + countTeddyBear + countDoll + countTruck + countMinion;

        if (countToy >= 50) {
            sumAllToy -= sumAllToy * 0.25;
        }

        sumAllToy -= sumAllToy * 0.1;

        double result = priceTrip - sumAllToy;

        if (sumAllToy >= priceTrip) {
            System.out.printf("Yes! %.2f lv left.", Math.abs(result));
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(result));
        }

    }
}
