package Fundamentals.P01_BasicSyntaxConditionalStatementsAndLoops.ex;

import java.util.Scanner;

public class P03_Vacantion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countPeople = Integer.parseInt(sc.nextLine());
        String typePeople = sc.nextLine();
        String dayOfWeek = sc.nextLine();

        double singelPrice = 0.0;

        switch (dayOfWeek) {
            case "Friday":
                switch (typePeople) {
                    case "Students":
                        singelPrice = 8.45;
                        break;
                    case "Business":
                        singelPrice = 10.9;
                        break;
                    case "Regular":
                        singelPrice = 15.0;
                        break;
                }
                break;
            case "Saturday":
                switch (typePeople) {
                    case "Students":
                        singelPrice = 9.80;
                        break;
                    case "Business":
                        singelPrice = 15.60;
                        break;
                    case "Regular":
                        singelPrice = 20.0;
                        break;
                }
                break;
            case "Sunday":
                switch (typePeople) {
                    case "Students":
                        singelPrice = 10.46;
                        break;
                    case "Business":
                        singelPrice = 16.00;
                        break;
                    case "Regular":
                        singelPrice = 12.50;
                        break;
                }
                break;
        }

        double price = singelPrice * countPeople;

        if (typePeople.equals("Students") && countPeople >= 30){
            price = price - (price *15 /100);
        }
        if (typePeople.equals("Business") && countPeople >= 100){
            price = singelPrice * (countPeople - 10);
        }
        if (typePeople.equals("Regular") && (countPeople >= 10 && countPeople <= 20)){
            price = price - (price *5 /100);
        }

        System.out.printf("Total price: %.2f",price);

    }
}
