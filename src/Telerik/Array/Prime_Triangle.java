package Telerik.Array;

import java.util.Scanner;

public class Prime_Triangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean[] arr = new boolean[n + 1];

        for (int i = 1; i <= n ; i++) {
            boolean isPrime = true;
            for (int divisor = 2; divisor <= Math.sqrt(i); divisor ++){
                if(i % divisor == 0){
                    isPrime = false;
                    break;
                }
            }
            arr[i] = isPrime;
            if (isPrime == true){
                for (int j = 1; j <= i; j++){
                    if (arr[j] == true){
                        System.out.print("1");
                    }else {
                        System.out.print("0");
                    }
                }
                System.out.println();
            }

        }
    }
}