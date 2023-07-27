package Programming_Basic.P02_ConditionalStatements.ex;

import java.util.Scanner;

public class P03_TimePlus15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hours = sc.nextInt();
        int minutes = sc.nextInt();

        int minutesPlusFifteen = minutes + 15;

        if (minutesPlusFifteen > 59){
            hours += 1;
            if (hours > 23){
                hours = hours - 24;
            }
            minutes = minutesPlusFifteen - 60;
        }else {
            minutes = minutesPlusFifteen;
        }
        if (minutes > 9){
            System.out.printf("%d:%d", hours,minutes);
        }else {
            System.out.printf("%d:0%d",hours,minutes);
        }
    }
}
