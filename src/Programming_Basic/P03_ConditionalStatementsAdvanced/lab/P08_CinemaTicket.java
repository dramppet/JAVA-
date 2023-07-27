package Programming_Basic.P03_ConditionalStatementsAdvanced.lab;

import java.util.Scanner;

public class P08_CinemaTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String day = sc.nextLine();

        switch (day){
            case "Monday":
            case "Tuesday":
            case "Friday":
                System.out.println(12);
                break;
            case "Wednesday":
            case "Thursday":
                System.out.println(14);
                break;
            case "Saturday":
            case "Sunday":
                System.out.println(16);
                break;

        }
    }
}
