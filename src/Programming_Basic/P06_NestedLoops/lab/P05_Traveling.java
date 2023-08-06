package Programming_Basic.P06_NestedLoops.lab;

import java.util.Scanner;

public class P05_Traveling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        while (!input.equals("End")){
            String destination = input;
            double budget = Double.parseDouble(sc.nextLine());

            double sum = 0.0;

            while (sum < budget){
                double price = Double.parseDouble(sc.nextLine());
                sum += price;
            }
            System.out.printf("Going to %s!%n",destination);
            input = sc.nextLine();
        }
    }
}
