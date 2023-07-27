package Programming_Basic.P02_ConditionalStatements.ex;

import java.util.Scanner;

public class P08_LunchBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nameSer = sc.nextLine();
        int prodS = Integer.parseInt(sc.nextLine());
        int prodP = Integer.parseInt(sc.nextLine());

        double timeOb = prodP/8.0;
        double timeOt = prodP / 4.0;
        double leftTime = prodP -timeOb - timeOt;

        if(leftTime >= prodS){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",nameSer,Math.ceil(leftTime) - prodS);
        }else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",nameSer,Math.abs(Math.floor(leftTime) - prodS));
        }
    }
}
