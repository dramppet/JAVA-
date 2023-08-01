package Programming_Basic.P05_WhileLoop.ex;

import java.util.Scanner;

public class P01_OldBooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String searchedBook = sc.nextLine();

        String input = sc.nextLine();
        int bookCount = 0;
        boolean isBookFound = false;

        while (!input.equals("No More Books")) {

            if (input.equals(searchedBook)) {
                isBookFound = true;
                break;
            }
            bookCount++;
            input = sc.nextLine();
        }
        if (isBookFound){
            System.out.printf("You checked %d books and found it.", bookCount);
        }else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", bookCount);
        }
    }
}
