package Programming_Basic.P04_ForLoop.ex;

import java.util.Scanner;

public class P03_Histograma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countNumbers = Integer.parseInt(sc.nextLine());

        int p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0;

        for (int i = 0; i < countNumbers; i++) {
            int num = Integer.parseInt(sc.nextLine());

            if (num > 0 && num < 200) {
                ++p1;
            } else if (num > 0 && num <= 399) {
                ++p2;
            } else if (num > 0 && num <= 599) {
                ++p3;
            } else if (num > 0 && num <= 799) {
                ++p4;
            } else {
                ++p5;
            }
        }


        System.out.printf("%.2f%%%n", (double) p1 / countNumbers * 100);
        System.out.printf("%.2f%%%n", (double) p2 / countNumbers * 100);
        System.out.printf("%.2f%%%n", (double) p3 / countNumbers * 100);
        System.out.printf("%.2f%%%n", (double) p4 / countNumbers * 100);
        System.out.printf("%.2f%%%n", (double) p5 / countNumbers * 100);
    }
}
