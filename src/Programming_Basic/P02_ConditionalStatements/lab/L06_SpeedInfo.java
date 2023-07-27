package Programming_Basic.P02_ConditionalStatements.lab;

import java.util.Scanner;

public class L06_SpeedInfo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double sped = sc.nextDouble();

        if (sped <= 10){
            System.out.println("slow");
        } else if (sped <= 50) {
            System.out.println("average");
        } else if (sped <= 150) {
            System.out.println("fast");
        } else if (sped <= 1000) {
            System.out.println("ultra fast");
        }else {
            System.out.println("extremely fast");
        }
    }
}
