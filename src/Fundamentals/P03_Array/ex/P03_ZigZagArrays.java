package Fundamentals.P03_Array.ex;

import java.util.Scanner;

public class P03_ZigZagArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = Integer.parseInt(sc.nextLine());

        String[] first = new String[size];
        String[] second = new String[size];

        for (int i = 0; i < first.length; i++) {
            String[] arr = sc.nextLine().split(" ");

            if (i % 2 == 0) {
                first[i] = arr[0];
                second[i] = arr[1];
            }else {
                first[i] = arr[1];
                second[i] = arr[0];
            }
        }
        System.out.println(String.join(" ",first));
        System.out.println(String.join(" ",second));
    }
}
