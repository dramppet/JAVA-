package Programming_Basic.P04_ForLoop.ex;

import java.util.Scanner;

public class P02_HalfSumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countNumbers = Integer.parseInt(sc.nextLine());

        int maxNumber = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < countNumbers; i++){
            int num = sc.nextInt();

            if (num >= maxNumber){
                maxNumber = num;
            }

            sum += num;
        }
        sum -= maxNumber;

        if (sum == maxNumber){
            System.out.printf("Yes%nSum = %d",maxNumber);;
        }else {
            System.out.printf("No%nDiff = %d",Math.abs(sum - maxNumber));
        }
    }
}
