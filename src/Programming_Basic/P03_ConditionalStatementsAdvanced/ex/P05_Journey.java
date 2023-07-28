package Programming_Basic.P03_ConditionalStatementsAdvanced.ex;

import java.util.Scanner;

public class P05_Journey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double budget = Double.parseDouble(sc.nextLine());
        String season = sc.nextLine();

        String destination = "";
        String typeVacantion = "";

        double discount = 0.0;

        if (budget <= 100){
            destination = "Bulgaria";
            if (season.equals("summer")){
                typeVacantion = "Camp";
                discount = budget * 30 /100;
            }else {
                typeVacantion = "Hotel";
                discount = budget * 70 / 100;
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")){
                typeVacantion = "Camp";
                discount = budget * 40 /100;
            }else {
                typeVacantion = "Hotel";
                discount = budget * 80 / 100;
            }
        }else {
            destination = "Europe";
            typeVacantion = "Hotel";
            discount = budget * 90 /100;
        }
        System.out.println(String.format("Somewhere in %s", destination));
        System.out.printf(String.format("%s - %.2f", typeVacantion,discount));
    }
}
