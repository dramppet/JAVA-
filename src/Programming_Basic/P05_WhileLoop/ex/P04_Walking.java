package Programming_Basic.P05_WhileLoop.ex;

import java.util.Scanner;

public class P04_Walking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        boolean going = true;

        String command = sc.nextLine();
        while (!command.equals("Going home")) {
            int dayWalking = Integer.parseInt(command);
            sum += dayWalking;

            if (sum >= 10000){
                going = false;
                System.out.println("Goal reached! Good job!");
                System.out.printf("%d steps over the goal!",sum - 10000);
                break;
            }

            command = sc.nextLine();
        }
        if (going){
            int steps = Integer.parseInt(sc.nextLine());
            sum+=steps;
            if (sum >= 10000){
                System.out.println("Goal reached! Good job!");
                System.out.printf("%d steps over the goal!",sum - 10000);
            }else {
                System.out.printf("%d more steps to reach goal.",10000-sum);

            }
        }
    }
}
