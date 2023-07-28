package Programming_Basic.P03_ConditionalStatementsAdvanced.ex;

import java.util.Scanner;

public class P01_Cinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String typeProjection = sc.nextLine();
        int countRow = Integer.parseInt(sc.nextLine());
        int countColum = Integer.parseInt(sc.nextLine());

        double ticketPrice = switch (typeProjection) {
            case "Premiere" -> 12.0;
            case "Normal" -> 7.50;
            case "Discount" -> 5.00;
            default -> 0.0;
        };

        double profit = (countRow * countColum) * ticketPrice;

        System.out.println(String.format("%.2f leva",profit));
    }
}
