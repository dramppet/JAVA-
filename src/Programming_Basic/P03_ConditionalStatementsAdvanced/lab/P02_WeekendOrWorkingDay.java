package Programming_Basic.P03_ConditionalStatementsAdvanced.lab;

import java.util.Scanner;

public class P02_WeekendOrWorkingDay {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String dayOfWeek = sc.nextLine();

        switch (dayOfWeek) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("Working day");
            case "Saturday", "Sunday" -> System.out.println("Weekend");
            default -> System.out.println("Error");
        }
    }
}
