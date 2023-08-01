package Fundamentals.P03_Array.ex;

import java.util.Scanner;

public class P02_CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] inputFirst = sc.nextLine().split(" ");
        String[] inputSecond = sc.nextLine().split(" ");

        for(String word : inputSecond){
            for(String secondWord : inputFirst){

                if (word.equals(secondWord)){
                    System.out.print(word + " ");
                }

            }
        }

    }
}
