package Programming_Basic.P04_ForLoop.lab;

import java.util.Scanner;

public class P03_NumbersToNWithStep3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        for (int i = 1; i <= number ; i+=3) {
            System.out.println(i);
        }
    }
}
