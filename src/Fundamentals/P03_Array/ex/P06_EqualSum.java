package Fundamentals.P03_Array.ex;

import java.util.*;

public class P06_EqualSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < arr.length; i++) {

            int leftSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }

            int rightSum = 0;
            for (int j =  i + 1; j < arr.length ; j++) {
                rightSum += arr[j];
            }
            if (leftSum == rightSum){
                System.out.println(i);
                return;
            }
        }
        System.out.println("no");
    }
}
