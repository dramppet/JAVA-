package Programming_Basic.P04_ForLoop.ex;

import java.util.Scanner;

public class P05_Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int openTags = Integer.parseInt(sc.nextLine());
        int salary = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < openTags; i++) {
            String tag = sc.nextLine();

            if (salary <= 0){
                break;
            }

            switch (tag){
                case "Facebook":
                    salary -= 150;
                    break;
                case "Instagram":
                    salary -= 100;
                    break;
                case "Reddit":
                    salary -= 500;
                    break;
            }
        }
        if (salary <= 0){
            System.out.println("You have lost your salary.");
        } else {
            System.out.println(salary);
        }
    }
}
