package Programming_Basic.P05_WhileLoop.lab;

import java.util.Scanner;

public class P02_Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String userName = sc.nextLine();
        String password = sc.nextLine();

        String text = sc.nextLine();
        while (!text.equals(password)){
            text = sc.nextLine();
        }
        System.out.printf("Welcome %s!",userName);
    }
}
