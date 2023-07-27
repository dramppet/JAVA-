package Programming_Basic.P02_ConditionalStatements.ex;

import java.util.Scanner;

public class P07_Shopping {
    static double PRICE_VGA = 250;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double budget = Double.parseDouble(sc.nextLine());
        int countVGA = Integer.parseInt(sc.nextLine());
        int countProcessor = Integer.parseInt(sc.nextLine());
        int countRAM = Integer.parseInt(sc.nextLine());

        double sumVGA = countVGA * PRICE_VGA;
        double sumProcessor = countProcessor * (sumVGA * 0.35);
        double sumRam = countRAM * (sumVGA * 0.1);

        double allSum = sumVGA + sumProcessor + sumRam;

        if (countVGA > countProcessor){
            allSum -= allSum * 0.15;
        }

        double result = budget - allSum;
        if (budget >= allSum){
            System.out.printf("You have %.2f leva left!", Math.abs(result));
        }else {
            System.out.printf("Not enough money! You need %.2f leva more!", Math.abs(result));
        }




    }
}
