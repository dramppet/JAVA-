package Programming_Basic.P04_ForLoop.ex;

import java.util.Scanner;

public class P04_CleverLily {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int yearLily = Integer.parseInt(sc.nextLine());
        double priceWatermachina = Double.parseDouble(sc.nextLine());
        int priceSingeToy = Integer.parseInt(sc.nextLine());

        int money = 0;
        int countToy = 0;

        for (int i = 1; i <= yearLily; i++) {
            if(i % 2 == 1){
                countToy ++;
            }else {
                money-=1;
                money += (10 * i ) / 2;

            }
        }
        int sum = Math.abs(money + (priceSingeToy * countToy));
        double sumValue = Math.abs(sum - priceWatermachina);
        if (sum >= priceWatermachina){
            System.out.printf("Yes! %.2f", sumValue );
        }else{
            System.out.printf("No! %.2f",sumValue);
        }
    }
}
