package Programming_Basic.P05_WhileLoop.ex;

import java.util.Scanner;

public class P02_ExamPreparation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxPoorGrades = Integer.parseInt(sc.nextLine());

        String input = sc.nextLine();

        int gradesSum = 0;
        int taskCount = 0;
        int poorGradesCount = 0;
        boolean poorStudent = false;
        String lastTask = "";

        while (!input.equals("Enough")) {

            int grade = Integer.parseInt(sc.nextLine());
            if (grade <= 4) {
                poorGradesCount++;
            }
            if (poorGradesCount == maxPoorGrades) {
                poorStudent = true;
                break;
            }
            gradesSum += grade;
            taskCount++;
            lastTask = input;

            input = sc.nextLine();
        }
        if (poorStudent) {
            System.out.printf("You need a break, %d poor grades.", poorGradesCount);
        } else {
            System.out.printf("Average score: %.2f%n", ((double) gradesSum / taskCount));
            System.out.printf("Number of problems: %s%n", taskCount);
            System.out.printf("Last problem: %s%n", lastTask);
        }
    }
}
