package Programming_Basic.P03_ConditionalStatementsAdvanced.lab;

import java.util.Scanner;

public class P03_AnimalType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String animalType = sc.nextLine();

        switch (animalType) {
            case "dog" -> System.out.println("mammal");
            case "crocodile", "tortoise", "snake" -> System.out.println("reptile");
            default -> System.out.println("unknown");
        }
    }
}
