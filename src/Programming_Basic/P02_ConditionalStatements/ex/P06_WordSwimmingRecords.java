package Programming_Basic.P02_ConditionalStatements.ex;

import java.util.Scanner;

public class P06_WordSwimmingRecords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double records = Double.parseDouble(sc.nextLine());
        double distance = Double.parseDouble(sc.nextLine());
        double timeSec = Double.parseDouble(sc.nextLine());

        double needSwim = distance * timeSec;
        double add = ((int)(distance / 15)) * 12.5;
        double allTime = needSwim + add;

        if (allTime < records){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",allTime);
        }else {
            System.out.printf("No, he failed! He was %.2f seconds slower.",Math.abs(allTime - records));
        }
    }
}
