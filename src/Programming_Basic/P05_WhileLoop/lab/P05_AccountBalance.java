package Programming_Basic.P05_WhileLoop.lab;

import java.util.Scanner;

public class P05_AccountBalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String command = sc.nextLine();

        double total = 0.0;

        while (!command.equals("NoMoreMoney")){
            double number = Double.parseDouble(command);


            if (number < 0){
                System.out.println("Invalid operation!");
                break;
            }
            System.out.printf("Increase: %.2f%n",number);

            total += number;

            command = sc.nextLine();
        }
        System.out.println(String.format("Total: %.2f",total));
    }
}
