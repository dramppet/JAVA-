package Programming_Basic.P04_ForLoop.ex;

import java.util.Scanner;

public class P03_Histograma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countNumbers = Integer.parseInt(sc.nextLine());

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;

        for (int i = 0; i < countNumbers; i++) {
            int num = Integer.parseInt(sc.nextLine());

            if (num < 200) {
                p1 += 1;
            } else if (num <= 399) {
                p2 += 1;
            } else if (num <= 599) {
                p3 += 1;
            } else if (num <= 799) {
                p4 += 1;
            } else {
                p5 += 1;
            }
        }
        double sumP1 = p1 / countNumbers * 100;
        double sumP2 = p2 / countNumbers * 100;
        double sumP3 = p3 / countNumbers * 100;
        double sumP4 = p4 / countNumbers * 100;
        double sumP5 = p5 / countNumbers * 100;

        System.out.printf("%.2f", sumP1);
        System.out.println('%');
        System.out.printf("%.2f", sumP2);
        System.out.println('%');
        System.out.printf("%.2f", sumP3);
        System.out.println('%');
        System.out.printf("%.2f", sumP4);
        System.out.println('%');
        System.out.printf("%.2f", sumP5);
        System.out.println('%');
    }
}
