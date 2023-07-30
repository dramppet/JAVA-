package Programming_Basic.P05_WhileLoop.lab;

import java.util.Scanner;

public class P03_SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxNumber = sc.nextInt();

        int sum = 0;
        while ( sum < maxNumber){
            sum += sc.nextInt();;
        }
        System.out.println(sum);
    }
}
