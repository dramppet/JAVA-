package Programming_Basic.P01_FirstSrepsInCoding.ex;

import java.util.Scanner;

public class P03_Deposit_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double depositSum = Double.parseDouble(sc.nextLine());
        int countDeposit = Integer.parseInt(sc.nextLine());
        double year_lixva_procent = Double.parseDouble(sc.nextLine());

        double add_lixva = depositSum * (year_lixva_procent / 100);
        double lixva_for_mounth = add_lixva/ 12;
        double all_sum = depositSum + (countDeposit * lixva_for_mounth);

        System.out.println(all_sum);

    }
}
