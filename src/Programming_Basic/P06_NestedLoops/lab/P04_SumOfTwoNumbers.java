package Programming_Basic.P06_NestedLoops.lab;

import java.util.Scanner;

public class P04_SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();
        int findSum = sc.nextInt();


        int countCombination = 0;
        boolean findCombination = false;
        for (int i = start; i <= end ; i++) {

            for (int j = start; j <= end ; j++) {
                countCombination++;
                if (i + j == findSum){
                    findCombination = true;
                    System.out.printf("Combination N:%d ",countCombination);
                    System.out.printf("(%d + %d = %d)",i,j,findSum);
                    break;
                }

            }
            if (findCombination){
                break;
            }
        }
        if (!findCombination){
            System.out.printf("%d combinations - neither equals %d",countCombination,findSum);
        }
    }
}
