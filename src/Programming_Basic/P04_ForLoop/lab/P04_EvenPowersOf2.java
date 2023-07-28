package Programming_Basic.P04_ForLoop.lab;

import java.util.Scanner;

public class P04_EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0){
                System.out.println(Math.pow(2,i));
            }
        }
    }
}
