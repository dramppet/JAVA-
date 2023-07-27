package Programming_Basic.P03_ConditionalStatementsAdvanced.lab;

import java.util.Scanner;

public class P12_TradeCommissions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String city = sc.nextLine();
        double sellAll = Double.parseDouble(sc.nextLine());
        double commissions = 0.0;
        if (sellAll >= 0 && sellAll <= 500) {
            switch (city) {
                case "Sofia":
                    commissions = sellAll * 0.05;
                    break;
                case "Varna":
                    commissions = sellAll * 0.045;
                    break;
                case "Plovdiv":
                    commissions = sellAll * 0.055;
                    break;
            }
        } else if (sellAll > 500 && sellAll <= 1000) {
            switch (city) {
                case "Sofia":
                    commissions = sellAll * 0.07;
                    break;
                case "Varna":
                    commissions = sellAll * 0.075;
                    break;
                case "Plovdiv":
                    commissions = sellAll * 0.08;
                    break;
            }
        } else if (sellAll > 1000 && sellAll <= 10000) {
            switch (city) {
                case "Sofia":
                    commissions = sellAll * 0.08;
                    break;
                case "Varna":
                    commissions = sellAll * 0.1;
                    break;
                case "Plovdiv":
                    commissions = sellAll * 0.12;
            }
        } else if (sellAll > 10000) {
            switch (city) {
                case "Sofia":
                    commissions = sellAll * 0.12;
                    break;
                case "Varna":
                    commissions = sellAll * 0.13;
                    break;
                case "Plovdiv":
                    commissions = sellAll * 0.145;
                    break;
            }
        }
        if (commissions == 0.0) {
            System.out.println("error");
        } else {
            System.out.printf("%.2f", commissions);
        }
    }
}
