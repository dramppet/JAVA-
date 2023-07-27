package Programming_Basic.P01_First_Sreps_In_Coding.ex;

import java.util.Scanner;

public class P02_Radians_to_Degrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radians = Double.parseDouble(new Scanner(System.in).nextLine());
        double degrees = radians * 180 / Math.PI;

        System.out.println(degrees);
    }
}
