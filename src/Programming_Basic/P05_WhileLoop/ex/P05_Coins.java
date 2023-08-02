package Programming_Basic.P05_WhileLoop.ex;

import java.util.Scanner;

public class P05_Coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double coinss = Double.parseDouble(sc.nextLine()) * 100;

        int coins = (int)coinss;

        int countCoins = 0;

        while (coins >= 0) {

            if (coins - 200 >= 0) {
                coins = coins - 200;
                countCoins++;
            } else if (coins - 100 >= 0) {
                coins = coins - 100;
                countCoins++;
            } else if (coins - 50 >= 0) {
                coins = coins - 50;
                countCoins++;
            } else if (coins - 20 >= 0) {
                coins = coins - 20;
                countCoins++;
            } else if (coins - 10 >= 0) {
                coins = coins - 10;
            } else if (coins - 5 >= 0) {
                coins = coins - 5;
                countCoins++;
            } else if (coins - 2 >= 0) {
                coins -= 2;
                countCoins++;
            } else if (coins - 1 >= 0) {
                coins -= 1;
                countCoins++;
            }


        }
        System.out.println(countCoins);
    }
}
