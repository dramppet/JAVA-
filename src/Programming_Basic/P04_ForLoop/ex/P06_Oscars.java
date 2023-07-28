package Programming_Basic.P04_ForLoop.ex;

import java.util.Scanner;

public class P06_Oscars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nameActor = sc.nextLine();
        double pointAcademy = Double.parseDouble(sc.nextLine());
        int countGury = Integer.parseInt(sc.nextLine());

        double point = pointAcademy;

        for (int i = 0; i < countGury; i++) {
            String nameGury = sc.nextLine();
            double pointGury = Double.parseDouble(sc.nextLine());

            int len = nameGury.length();

            point += (nameGury.length() * pointGury) / 2;
        }

        if (point > 1250.5){
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", nameActor, point);
        }else {
            double dif = 1250.5 - point;
            System.out.printf("Sorry, %s you need %.1f more!", nameActor, dif);
        }
    }
}
