package Programming_Basic.P03_ConditionalStatementsAdvanced.ex;

import java.util.Scanner;

public class P03_NewHouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String typeOfFlowers = sc.nextLine();
        int contFlowers = Integer.parseInt(sc.nextLine());
        int budget = Integer.parseInt(sc.nextLine());

        double singlePriceOfFlowers = 0.0;

        switch (typeOfFlowers) {
            case "Roses":
                singlePriceOfFlowers = contFlowers * 5;
                if (contFlowers > 80) {
                    singlePriceOfFlowers -= singlePriceOfFlowers * 10 / 100;
                }
                break;
            case "Dahlias":
                singlePriceOfFlowers = contFlowers * 3.80;
                if (contFlowers > 90) {
                    singlePriceOfFlowers -= singlePriceOfFlowers * 15 / 100;
                }
                break;
            case "Tulips":
                singlePriceOfFlowers = contFlowers * 2.80;
                if (contFlowers > 80) {
                    singlePriceOfFlowers -= singlePriceOfFlowers * 15 / 100;
                }
                break;
            case "Narcissus":
                singlePriceOfFlowers = contFlowers * 3.00;
                if (contFlowers < 120) {
                    singlePriceOfFlowers += singlePriceOfFlowers * 15 / 100;
                }
                break;
            case "Gladiolus":
                singlePriceOfFlowers = contFlowers * 2.50;
                if (contFlowers < 80) {
                    singlePriceOfFlowers += singlePriceOfFlowers * 20 /100;
                }
                break;
        }


        if (budget >= singlePriceOfFlowers) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", contFlowers, typeOfFlowers, budget - singlePriceOfFlowers);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", singlePriceOfFlowers - budget);
        }
    }
}
