package Programming_Basic.P03_ConditionalStatementsAdvanced.lab;

import java.util.Scanner;

public class P01_DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dayOfWeek = sc.nextInt();

        String day = switch (dayOfWeek) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Error";
        };

        System.out.println(day);
    }
}
