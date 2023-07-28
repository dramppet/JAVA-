package Programming_Basic.P03_ConditionalStatementsAdvanced.ex;

import java.util.Scanner;

public class P04_FishingBoat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int budget = Integer.parseInt(sc.nextLine());
        String season = sc.nextLine();
        int countFishing = Integer.parseInt(sc.nextLine());

        double priceShip = 0;

        switch (season){
            case "Spring":
                priceShip = 3000;
                break;
            case "Summer":
            case "Autumn":
                priceShip = 4200;
                break;
            case "Winter":
                priceShip = 2600;
                break;
        }

        if (countFishing <= 6){
            priceShip = priceShip - priceShip * 10/100;

        } else if (countFishing <= 11) {
            priceShip = priceShip - priceShip * 15/100;
        }else {
            priceShip = priceShip - priceShip * 25/100;
        }

        if (countFishing % 2 == 0 && !season.equals("Autumn")){
            priceShip = priceShip - priceShip * 5 /100;
        }

        if (budget >= priceShip){
            System.out.printf("Yes! You have %.2f leva left.", budget - priceShip);
        }else {
            System.out.printf("Not enough money! You need %.2f leva.", priceShip - budget);
        }

    }
}
