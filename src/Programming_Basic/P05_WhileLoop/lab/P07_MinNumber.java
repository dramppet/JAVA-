package Programming_Basic.P05_WhileLoop.lab;

import java.util.Scanner;

public class P07_MinNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String command = sc.nextLine();

        int minNumber = Integer.MAX_VALUE;

        while (!command.equals("Stop")){

            int currentNumber = Integer.parseInt(command);

            if (currentNumber < minNumber){
                minNumber = currentNumber;
            }

            command = sc.nextLine();
        }

        System.out.println(minNumber);
    }
}
