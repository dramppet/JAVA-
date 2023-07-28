package Programming_Basic.P04_ForLoop.lab;

import java.util.Scanner;

public class P02_NumbersNTo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        for(int i = number; i >= 1; i--){
            System.out.println(i);
        }
    }
}
