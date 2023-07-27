package Programming_Basic.P01_First_Sreps_In_Coding.ex;

import java.util.Scanner;

public class P05_Supplies_fof_School {

    static double PACKETPEN = 5.80;
    static double PACKETMAR = 7.20;
    static double PREP = 1.20;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countPackPen = Integer.parseInt(sc.nextLine());
        int countPackMar = Integer.parseInt(sc.nextLine());
        int litriPrep = Integer.parseInt(sc.nextLine());
        int discount = Integer.parseInt(sc.nextLine());

        double pricePen = countPackPen * PACKETPEN;
        double priceMar = countPackMar * PACKETMAR;
        double pricePrep = litriPrep * PREP;

        double allSum = pricePen + priceMar + pricePrep;

        double priceDiscount = allSum * discount / 100;

        System.out.println(allSum - priceDiscount);

    }
}
