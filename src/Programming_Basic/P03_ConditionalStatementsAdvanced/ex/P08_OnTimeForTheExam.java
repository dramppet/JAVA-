package Programming_Basic.P03_ConditionalStatementsAdvanced.ex;

import java.util.Scanner;

public class P08_OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hourExam = Integer.parseInt(sc.nextLine());
        int minutesExam = Integer.parseInt(sc.nextLine());
        int hourArrival = Integer.parseInt(sc.nextLine());
        int minutesArrival = Integer.parseInt(sc.nextLine());

        int examTimeMinutes = hourExam * 60 + minutesExam;
        int arrivalTimeMinutes = hourArrival * 60 + minutesArrival;

        int diffMinutes = examTimeMinutes - arrivalTimeMinutes;

        String output;

        if (diffMinutes >= 0 && diffMinutes <= 30) {
            output = "on time";
        } else if (diffMinutes > 30) {
            output = "Early";
        } else {
            output = "Late";
        }

        System.out.println(output);

        String arrivalPeriod;

        if (diffMinutes > 0){
            arrivalPeriod = "before";
        }else {
            arrivalPeriod = "after";
        }

        diffMinutes = Math.abs(diffMinutes);

        if (diffMinutes < 60){
            System.out.printf("%d minutes %s the start",diffMinutes, arrivalPeriod);
        }else {
            System.out.printf("%d:%02d hours %s the start",diffMinutes / 60, diffMinutes % 60, arrivalPeriod);
        }
    }
}
