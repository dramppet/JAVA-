package Programming_Basic.P02_ConditionalStatements.ex;

import java.util.Scanner;

public class P02_BonusScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double points = sc.nextDouble();
        double bonus = 0;

        if (points <= 100) {
            bonus = 5;
        }

        if (points > 100) {
            bonus = points * 0.2;
        }

        if (points > 1000) {
            bonus = points * 0.1;
        }

        if (points % 2 == 0){
            bonus += 1;
        }

        if (points % 10 == 5){
            bonus += 2;
        }

        System.out.println(bonus);
        System.out.println(bonus + points);
    }
}
