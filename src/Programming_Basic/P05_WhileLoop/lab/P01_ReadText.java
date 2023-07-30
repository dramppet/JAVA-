package Programming_Basic.P05_WhileLoop.lab;

import java.util.Scanner;

public class P01_ReadText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        while (!text.equals("Stop")){
            System.out.println(text);
            text = sc.nextLine();
        }
    }
}
