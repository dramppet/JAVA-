package Programming_Basic.P05_WhileLoop.ex;

import java.util.Scanner;

public class P03_Vacation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double needCoinsForVacation = Double.parseDouble(sc.nextLine());
        double availableAmount = Double.parseDouble(sc.nextLine());

        int countSpend = 0;
        int days = 0;

        while (true){

            String command =sc.nextLine();
            double amount = Double.parseDouble(sc.nextLine());

            if (command.equals("spend")){
                countSpend++;
                availableAmount -= amount;
                if (availableAmount < 0){
                    availableAmount = 0;
                }
            } else if (command.equals("save")) {
                countSpend = 0;
                availableAmount += amount;
            }
            days++;

            if (availableAmount >= needCoinsForVacation){
                System.out.printf("You saved the money for %d days.", days);
                break;
            }
            if (countSpend >=5){
                System.out.println("You can't save the money.");
                System.out.printf("%d", days);
                break;
            }
        }
    }
}
