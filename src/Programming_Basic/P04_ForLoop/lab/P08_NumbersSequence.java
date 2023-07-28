package Programming_Basic.P04_ForLoop.lab;

import java.util.Scanner;

public class P08_NumbersSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countNumbers = sc.nextInt();

        int maxNumber = Integer.MIN_VALUE;
        int minNumber= Integer.MAX_VALUE;

        for (int i = 0; i < countNumbers; i++) {
            int num = sc.nextInt();

            if (num <= minNumber){
                minNumber = num;
            }

            if (num  >= maxNumber){
                maxNumber = num;
            }
        }
        System.out.printf("Max number: %d%n",maxNumber);
        System.out.printf("Min number: %d",minNumber);
    }
}
