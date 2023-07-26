package Programming_basic.P01_First_Sreps_In_Coding.lab;

import java.util.Scanner;

public class P04_Inches_To_Centimeters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double inches = Double.parseDouble(sc.nextLine());

        System.out.println(inches * 2.54);
    }
}
