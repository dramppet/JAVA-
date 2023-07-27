package Programming_Basic.P03_ConditionalStatementsAdvanced.lab;

import java.util.Scanner;

public class P04_PersonalTitles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double age = Double.parseDouble(sc.nextLine());
        String gender = sc.nextLine();

        if (gender.equals("m") && age >= 16) {
            System.out.println("Mr.");
        } else if (gender.equals("m") && age < 16) {
            System.out.println("Master");
        } else if (gender.equals("f") && age >= 16) {
            System.out.println("Ms.");
        } else if (gender.equals("f") && age < 16) {
            System.out.println("Miss");
        }
    }
}

