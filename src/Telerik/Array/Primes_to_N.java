package Telerik.Array;

import java.util.Scanner;

public class Primes_to_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.print(1 + " ");

        for(int i = 1; i <= num; i++){

           if (isPrime(i)){
               System.out.print( i  + " ");
           }
        }


    }
    public static boolean isPrime(int num){

        if (num < 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0){
                return false;
            }
        }

        return true;
    }
}
