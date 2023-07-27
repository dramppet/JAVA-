package Programming_Basic.P02_ConditionalStatements.ex;

import java.util.Scanner;

public class P05_GodzillaVsKong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double budgetFilm = Double.parseDouble(sc.nextLine());
        int countStatist = Integer.parseInt(sc.nextLine());
        double priceClothOneStatist = Double.parseDouble(sc.nextLine());

        double decorFilm = budgetFilm * 0.1;

        double sumClothAllStatist = countStatist * priceClothOneStatist;

        if (countStatist > 150) {
            sumClothAllStatist -= sumClothAllStatist * 0.1;
        }

        double allSumFilm = decorFilm + sumClothAllStatist;

        double sum = budgetFilm - allSumFilm;

        if (budgetFilm >= allSumFilm) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", Math.abs(sum));
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", Math.abs(sum));

        }
    }
}
