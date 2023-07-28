package Programming_Basic.P04_ForLoop.lab;

import java.util.Scanner;

public class P05_CharacterSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        for (int i = 0; i < input.length() ; i++) {
            System.out.println(input.charAt(i));
        }
    }
}
