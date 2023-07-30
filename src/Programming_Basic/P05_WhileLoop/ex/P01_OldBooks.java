package Programming_Basic.P05_WhileLoop.ex;

import java.util.Scanner;

public class P01_OldBooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String searchedBook = sc.nextLine();

        String command = sc.nextLine();

        int count = 0;
        boolean findBook = false;

        while (!command.equals("No More Books")) {

            if (command.equals(searchedBook)) {
                findBook = true;
                break;
            }
            count++;

            command = sc.nextLine();
        }
        if (findBook){
            System.out.printf("You checked %d books and found it.",count);
        }else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", count);
        }
    }
}
