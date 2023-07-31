package Fundamentals.P01_BasicSyntaxConditionalStatementsAndLoops.ex;

import java.util.Scanner;

public class P10_RageExpenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lostGames = Integer.parseInt(sc.nextLine());
        double headsetPrice = Double.parseDouble(sc.nextLine());
        double mousePrice = Double.parseDouble(sc.nextLine());
        double keyboardPrice = Double.parseDouble(sc.nextLine());
        double displayPrice = Double.parseDouble(sc.nextLine());

        int countHeadset = 0;
        int countMouse = 0;
        int countKeyboard = 0;
        int countDisplay = -1;

        int trashedHeadsets = lostGames / 2;
        int trashedMice = lostGames / 3;
        int trashedKeyboards = lostGames / 6;
        int trashedDisplays = trashedKeyboards / 2;

        double totalExpenses = (trashedHeadsets * headsetPrice) +
                (trashedMice * mousePrice) +
                (trashedKeyboards * keyboardPrice) +
                (trashedDisplays * displayPrice);

        System.out.printf("Rage expenses: %.2f lv.", totalExpenses);
    }
}
