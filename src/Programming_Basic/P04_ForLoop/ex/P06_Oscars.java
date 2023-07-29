package Programming_Basic.P04_ForLoop.ex;

import java.util.Scanner;

public class P06_Oscars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nameActor = sc.nextLine();
        double points = Double.parseDouble(sc.nextLine());
        int countJudges = Integer.parseInt(sc.nextLine());


        for (int i = 0; i < countJudges; i++) {
            String nameJudges = sc.nextLine();
            double pointJudges = Double.parseDouble(sc.nextLine());

            points += (nameJudges.length() * pointJudges) / 2;

            if (points > 1250.5){
                break;
            }
        }

        if (points > 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", nameActor, points);
        } else {
            double dif = 1250.5 - points;
            System.out.printf("Sorry, %s you need %.1f more!", nameActor, dif);
        }
    }
}
