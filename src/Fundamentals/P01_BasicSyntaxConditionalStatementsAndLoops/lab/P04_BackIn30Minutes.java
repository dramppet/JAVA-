package Fundamentals.P01_BasicSyntaxConditionalStatementsAndLoops.lab;

import java.util.Scanner;

public class P04_BackIn30Minutes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hours = sc.nextInt();
        int minutes = sc.nextInt();

        minutes += 30;

        if (minutes >= 60){
            hours++;
            minutes-=60;
            if (hours >= 24){
                hours-=24;
            }
        }
        System.out.printf("%d:%02d",hours,minutes);
    }
}
