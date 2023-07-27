package Programming_Basic.P02_ConditionalStatements.ex;

import java.util.Scanner;

public class P01_SumSeconds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstSecond = sc.nextInt();
        int secondSecond = sc.nextInt();
        int thirdSecond = sc.nextInt();

        int sumSecond = firstSecond + secondSecond + thirdSecond;

        int minutes = sumSecond / 60;
        int seconds = sumSecond % 60;

        if (seconds > 9){
            System.out.printf("%d:%d",minutes,seconds);
        }else {
            System.out.printf("%d:0%d",minutes,seconds);
        }
    }
}
