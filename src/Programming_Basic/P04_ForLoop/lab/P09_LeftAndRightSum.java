package Programming_Basic.P04_ForLoop.lab;

import java.util.Scanner;

public class P09_LeftAndRightSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countNumbers = Integer.parseInt(sc.nextLine());

        int left  = 0;

        for (int i = 0; i < countNumbers; i++) {
            left += sc.nextInt();
        }

        int right = 0;

        for (int i = 0; i <countNumbers ; i++) {
            right += sc.nextInt();
        }

        if(left == right){
            System.out.printf("Yes, sum = %d", left);
        }else {
            System.out.printf("No, diff = %d", Math.abs(left - right));
        }
    }
}
