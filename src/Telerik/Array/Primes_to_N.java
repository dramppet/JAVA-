package Telerik.Array;

import java.util.Scanner;

public class Primes_to_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){

           if (isPrime(i)){
               System.out.print( i  + " ");
           }
        }
    }
    public static boolean isPrime(int num){

        for (int i = 2; i <= num / 2; i++){
            if (num % i == 0){
                return false;
            }
        }

        return true;
    }
}
