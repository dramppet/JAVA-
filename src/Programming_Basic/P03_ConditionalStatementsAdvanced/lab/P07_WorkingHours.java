package Programming_Basic.P03_ConditionalStatementsAdvanced.lab;

import java.util.Scanner;

public class P07_WorkingHours {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hours = Integer.parseInt(sc.nextLine());
        String day = sc.nextLine();

        if (hours < 10 || hours > 18 || day.equals("Sunday")){
            System.out.println("closed");
        }else {
            System.out.println("open");
        }
    }
}
