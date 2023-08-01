package Fundamentals.P03_Array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class P05_TopIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for(int i = 0; i < input.length - 1; i++){
            int currentNumber = input[i];
            boolean isBigger = true;
            for (int j =  i + 1; j < input.length; j++) {
                int number = input[j];
                if (currentNumber <=  number){
                    isBigger = false;
                    break;
                }
            }
            if (isBigger){
                System.out.print(currentNumber + " ");
            }
        }
        System.out.print(input[input.length - 1]);
    }
}
