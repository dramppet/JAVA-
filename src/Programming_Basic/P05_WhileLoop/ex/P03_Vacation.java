package Programming_Basic.P05_WhileLoop.ex;

import java.util.Scanner;

public class P03_Vacation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double needCoinsForVacation = Double.parseDouble(sc.nextLine());
        double nowCoins = Double.parseDouble(sc.nextLine());

        int countSpend = 0;
        int count = 0;

        while (true){

            String command =sc.nextLine();
            double coins = Double.parseDouble(sc.nextLine());

            if (command.equals("spend")){
                countSpend++;
                nowCoins -= coins;
                if (nowCoins < 0){
                    nowCoins = 0;
                }
            } else if (command.equals("save")) {
                nowCoins += coins;
            }
            count++;

            if (nowCoins >= needCoinsForVacation){
                System.out.printf("You saved the money for %d days.",count);
                break;
            }
            if (countSpend >=5){
                System.out.println("You can't save the money.");
                System.out.printf("%d",count);
                break;
            }
        }
    }
}
