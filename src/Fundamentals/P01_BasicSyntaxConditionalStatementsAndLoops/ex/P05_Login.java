package Fundamentals.P01_BasicSyntaxConditionalStatementsAndLoops.ex;

import java.util.Scanner;

public class P05_Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String userName = sc.nextLine();
        String password = "";

        for (int i = userName.length() - 1; i >= 0; i--) {
            password += userName.charAt(i);
        }
        String currentPassword = sc.nextLine();
        int counter = 1;
        boolean correctPassword = true;
       while (!password.equals(currentPassword)){
           if (counter >= 4){
               correctPassword = false;
               break;
           }
           System.out.println("Incorrect password. Try again.");
           counter++;
           currentPassword = sc.nextLine();
       }
       if (correctPassword){
           System.out.printf("User %s logged in.",userName);
       }else {
           System.out.printf("User %s blocked!",userName);
       }
    }
}
