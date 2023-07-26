package Programming_Basic.P01_First_Sreps_In_Coding.lab;

import java.util.Scanner;

public class P05_Greeting_by_name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        System.out.printf("Hello, %s! ", name);
    }
}
