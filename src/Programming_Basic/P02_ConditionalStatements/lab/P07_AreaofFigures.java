package Programming_Basic.P02_ConditionalStatements.lab;

import java.util.Scanner;

public class P07_AreaofFigures {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String figura = scanner.nextLine();

        double rez = 0.0;

        if(figura.equals("square")){
            double side = Double.parseDouble(scanner.nextLine());
            rez = side * side;

        }else  if(figura.equals("rectangle")){
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());

            rez = a * b;
        }else if(figura.equals("circle")){
            double a = Double.parseDouble(scanner.nextLine());

            rez =Math.PI * Math.pow(a,2);
        }else{
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());

            rez = (a * b) / 2;
        }

        System.out.printf("%.3f",rez);
    }
}
