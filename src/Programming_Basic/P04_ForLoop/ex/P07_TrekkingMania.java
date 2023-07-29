package Programming_Basic.P04_ForLoop.ex;

import java.util.Scanner;

public class P07_TrekkingMania {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countGroups = Integer.parseInt(sc.nextLine());

        int Mysala = 0, Monblan = 0, Kilimandjaro = 0, K2 = 0, Everest = 0;
        int allGroups = 0;

        for (int group = 0; group < countGroups; ++group) {
            int groupOfPeople = Integer.parseInt(sc.nextLine());

            allGroups += groupOfPeople;

            if (groupOfPeople <= 5) {
                Mysala += groupOfPeople;
            } else if (groupOfPeople <= 12) {
                Monblan += groupOfPeople;
            } else if (groupOfPeople <= 25) {
                Kilimandjaro += groupOfPeople;
            } else if (groupOfPeople <= 40) {
                K2 += groupOfPeople;
            } else {
                Everest += groupOfPeople;
            }
        }
        System.out.printf("%.2f%%%n", ((double) Mysala / allGroups * 100));
        System.out.printf("%.2f%%%n", ((double) Monblan / allGroups * 100));
        System.out.printf("%.2f%%%n", ((double) Kilimandjaro / allGroups * 100));
        System.out.printf("%.2f%%%n", ((double) K2 / allGroups * 100));
        System.out.printf("%.2f%%%n", ((double) Everest / allGroups * 100));
    }
}
