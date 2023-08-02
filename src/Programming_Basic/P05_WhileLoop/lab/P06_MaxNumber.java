package Programming_Basic.P05_WhileLoop.lab;

import java.util.Scanner;

public class P06_MaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String command = sc.nextLine();

        int maxNumber = Integer.MIN_VALUE;

        while (!command.equals("Stop")){

            int currentNumber = Integer.parseInt(command);

            if (currentNumber >= maxNumber){
                maxNumber = currentNumber;
            }

            command = sc.nextLine();
        }
        System.out.println(maxNumber);
    }
}
