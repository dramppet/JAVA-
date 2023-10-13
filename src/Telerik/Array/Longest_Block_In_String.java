package Telerik.Array;

import java.util.Scanner;

public class Longest_Block_In_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();

        if (line.length() == 1) {
            System.out.println(line);
            return;
        }

        int count = 1;
        int maxCount = 1;

        char symbol = '\0';

        for (int i = line.length() - 1; i > 0; i--) {
            char first = line.charAt(i);
            char second = line.charAt(i - 1);

            if (first == second) {
                count++;
            } else {
                count = 1;
            }

            if (count >= maxCount) {
                maxCount = count;
                symbol = first;
            }
//
//            System.out.printf("%c%c%n", first,second);
        }

        if (maxCount == 1) {
            System.out.println(" ");
        } else
            for (int i = 0; i < maxCount; i++) {
                System.out.print(symbol);
            }
    }
    }

