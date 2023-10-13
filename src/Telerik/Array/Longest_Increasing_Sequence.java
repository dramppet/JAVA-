package Telerik.Array;

import java.util.Scanner;

public class Longest_Increasing_Sequence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int countNumber = Integer.parseInt(sc.nextLine());
        
        int countLongest = 1;
        int maxLongest = 1;
        int firstNumber = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < countNumber - 1; i++) {
            int nextNumber = Integer.parseInt(sc.nextLine());

            if (firstNumber < nextNumber){
                countLongest ++;
                firstNumber = nextNumber;
            }else {
                countLongest = 1;
                firstNumber = nextNumber;
            }

            if (countLongest > maxLongest){
                maxLongest = countLongest;
            }
        }
        System.out.println(maxLongest);
        
        
    }
}
