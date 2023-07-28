package Programming_Basic.P03_ConditionalStatementsAdvanced.ex;

import java.util.Scanner;

public class P09_SkiTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countNight = Integer.parseInt(sc.nextLine()) - 1;
        String typeRoom = sc.nextLine();
        String review = sc.nextLine();

        double price;

        if (typeRoom.equals("room for one person")) {
            price = countNight * 18;
        } else if (typeRoom.equals("apartment")) {
            price = countNight * 25;
            if (countNight < 10) {
                price = price - price * 30 / 100;
            } else if (countNight <= 15) {
                price = price - price * 35 / 100;
            } else {
                price = price - price * 50 / 100;
            }
        } else {
            price = countNight * 35;
            if (countNight < 10) {
                price = price - price * 10 / 100;
            } else if (countNight <= 15) {
                price = price - price * 15 / 100;
            } else {
                price = price - price * 20 / 100;
            }
        }
        if (review.equals("positive")) {
            price = price + price * 25 / 100;
        } else {
            price = price - price * 10 / 100;
        }

        System.out.printf("%.2f", price);
    }
}
