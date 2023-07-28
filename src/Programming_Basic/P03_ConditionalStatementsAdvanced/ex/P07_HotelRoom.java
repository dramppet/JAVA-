package Programming_Basic.P03_ConditionalStatementsAdvanced.ex;

import java.util.Scanner;

public class P07_HotelRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String typeOfM0nth = sc.nextLine();
        int countOfNight = Integer.parseInt(sc.nextLine());

        double priceStudio = 0.0;
        double priceApartment = 0.0;

        if (typeOfM0nth.equals("May") || typeOfM0nth.equals("October")){
            priceStudio = 50 * countOfNight;
            priceApartment = 65 * countOfNight;
            if (countOfNight > 14){
                priceStudio = priceStudio - priceStudio * 30 /100;
                priceApartment = priceApartment - priceApartment * 10 /100;
            } else if (countOfNight > 7) {
                priceStudio = priceStudio - priceStudio * 5 /100;
            }

        } else if (typeOfM0nth.equals("June") || typeOfM0nth.equals("September")) {
            priceStudio = 75.2 * countOfNight;
            priceApartment = 68.7 * countOfNight;
            if (countOfNight > 14){
                priceStudio = priceStudio - priceStudio * 20 /100;
                priceApartment = priceApartment - priceApartment * 10 /100;
            }

        } else if (typeOfM0nth.equals("July") || typeOfM0nth.equals("August")) {
            priceStudio = 76 * countOfNight;
            priceApartment = 77 * countOfNight;
            if (countOfNight > 14){
                priceApartment = priceApartment - priceApartment * 10 /100;
            }

        }

        System.out.printf("Apartment: %.2f lv. %n",priceApartment );
        System.out.printf("Studio: %.2f lv.",priceStudio );
    }
}
