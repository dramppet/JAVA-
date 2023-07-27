package Programming_Basic.P01_FirstSrepsInCoding.lab;

import java.util.Scanner;

public class P06_Concatenate_data {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        String age = sc.nextLine();
        String town = sc.nextLine();

        System.out.println(String.format("You are %s %s, a %s-years old person from %s.", firstName, lastName, age, town));
    }
}
