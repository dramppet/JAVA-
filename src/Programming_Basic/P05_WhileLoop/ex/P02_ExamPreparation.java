package Programming_Basic.P05_WhileLoop.ex;

import java.util.Scanner;

public class P02_ExamPreparation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int poor = Integer.parseInt(sc.nextLine());

        String command = sc.nextLine();

        int sum = 0;
        int countProblem = 0;
        int countPoor = 0;
        boolean poorStudent = false;
        String problem = "";

        while (!command.equals("Enough")) {

            int ocenka = Integer.parseInt(sc.nextLine());
            if (ocenka <= 4){
                countPoor++;
            }
            if (countPoor == poor){
                poorStudent = true;
                break;
            }
            sum += ocenka;
            countProblem++;
            problem = command;

            command = sc.nextLine();
        }
        if (poorStudent){
            System.out.printf("You need a break, %d poor grades.",countPoor);
        }else {
            System.out.printf("Average score: %.2f%n", ((double)sum / countProblem));
            System.out.printf("Number of problems: %s%n",countProblem);
            System.out.printf("Last problem: %s%n",problem);
        }
    }
}
