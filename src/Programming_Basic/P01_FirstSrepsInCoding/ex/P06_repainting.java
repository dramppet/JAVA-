package Programming_Basic.P01_FirstSrepsInCoding.ex;

import java.util.Scanner;

public class P06_repainting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int needed_nylon = Integer.parseInt(sc.nextLine());
        int needed_paint = Integer.parseInt(sc.nextLine());
        int needed_raz = Integer.parseInt(sc.nextLine());
        int hours = Integer.parseInt(sc.nextLine());

        double allNylon = (needed_nylon + 2) * 1.50;
        double allPain = (needed_paint + (needed_paint * 0.1 )) * 14.50;
        double allRaz = needed_raz * 5.00;;

        double materials = allNylon + allPain + allRaz + 0.4;
        double sumMais = (materials * 0.3) * hours;
        double finalSum = materials + sumMais;

        System.out.println(finalSum);
    }
}
