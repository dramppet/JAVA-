package Programming_Basic.P06_NestedLoops.lab;

import java.util.Scanner;

public class P03_Combination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int combination = sc.nextInt();

        int count = 0;
        for (int i = 0; i <= combination; i++) {
            for (int j = 0; j <= combination; j++) {
                for (int k = 0; k <= combination ; k++) {
                    if (i + j + k == combination){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
