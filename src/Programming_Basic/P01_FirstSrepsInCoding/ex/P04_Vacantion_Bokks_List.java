package Programming_Basic.P01_FirstSrepsInCoding.ex;

import java.util.Scanner;

public class P04_Vacantion_Bokks_List {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int countPages = Integer.parseInt(sc.nextLine());
        int pages = Integer.parseInt(sc.nextLine());
        int countDays = Integer.parseInt(sc.nextLine());

        int allTimeReadForOneBook = countPages / pages;
        int needHoursForDay = allTimeReadForOneBook / countDays;

        System.out.println(needHoursForDay);

    }
}
