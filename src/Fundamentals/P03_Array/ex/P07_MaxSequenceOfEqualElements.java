package Fundamentals.P03_Array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class P07_MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int countElement = 0;
        String elementStr = "";
        int maxSequence = 0;

        for (int i = 0; i < numbers.length; i++) {
            int element = numbers[i];
            for (int j =  i + 1; j < numbers.length; j++) {
                int secondElement = numbers[j];

                if (element == secondElement){
                    countElement++;
                    elementStr = String.valueOf(element);
                    if (countElement > maxSequence){
                        maxSequence = countElement;
                    }
                }else {
                    countElement = 0;
                    break;
                }

            }
        }
        System.out.println(elementStr.repeat(maxSequence));
    }
}
