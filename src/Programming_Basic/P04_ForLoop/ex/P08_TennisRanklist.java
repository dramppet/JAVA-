package Programming_Basic.P04_ForLoop.ex;

import java.util.Scanner;

public class P08_TennisRanklist{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countTurner = Integer.parseInt(sc.nextLine());
        int startPoints = Integer.parseInt(sc.nextLine());

        int points = 0;
        int victories = 0;

        for ( int i = 1; i <= countTurner; ++i){
            String stage = sc.nextLine();

            switch (stage) {
                case "W" -> {
                    points += 2000;
                    ++victories;
                }
                case "F" -> points += 1200;
                case "SF" -> points += 720;
            }
        }

        int allPoints = points + startPoints;

        System.out.printf("Final points: %d%n",allPoints);
        System.out.printf("Average points: %d%n", points / countTurner);
        System.out.printf("%.2f%%", ((double) victories / countTurner) * 100);
    }
}
