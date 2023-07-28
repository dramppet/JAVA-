package Programming_Basic.P04_ForLoop.lab;

import java.util.Scanner;

public class P06_VowelsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        int sumSymbol = 0;

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            switch (symbol){
                case 'a':
                    sumSymbol += 1;
                    break;
                case 'e':
                    sumSymbol += 2;
                    break;
                case 'i':
                    sumSymbol += 3;
                    break;
                case 'o':
                    sumSymbol += 4;
                    break;
                case 'u':
                    sumSymbol += 5;
                    break;
            }
        }
        System.out.println(sumSymbol);
    }
}
