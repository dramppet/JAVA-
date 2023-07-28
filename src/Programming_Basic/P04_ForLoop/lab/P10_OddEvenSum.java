package Programming_Basic.P04_ForLoop.lab;

import java.util.Scanner;

public class P10_OddEvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countNumbers = sc.nextInt();

        int evenSum = 0;
        int oddSum = 0;

        for(int i = 0; i < countNumbers; ++i){
            int num = sc.nextInt();

            if (i % 2 == 0){
                evenSum += num;
            }else {
                oddSum += num;
            }
        }

        if (evenSum == oddSum){
            System.out.printf("Yes%nSum = %d", evenSum);
        }else {
            System.out.printf("No%nDiff = %d", Math.abs(evenSum - oddSum));
        }
    }
}
