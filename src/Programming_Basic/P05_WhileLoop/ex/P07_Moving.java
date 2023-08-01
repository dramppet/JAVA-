package Programming_Basic.P05_WhileLoop.ex;

import java.util.Scanner;

public class P07_Moving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int weightSpace = Integer.parseInt(sc.nextLine());
        int lengthSpace = Integer.parseInt(sc.nextLine());
        int heightSpace = Integer.parseInt(sc.nextLine());

        int freeSpace = weightSpace * lengthSpace * heightSpace;

        boolean noFreeSpace = true;

        while (freeSpace >= 0) {

            String command = sc.nextLine();

            if (command.equals("Done")) {
                System.out.printf("%d Cubic meters left.", freeSpace);
                noFreeSpace = false;
                break;
            }

            int box = Integer.parseInt(command);
            freeSpace -= box;
        }
        if (noFreeSpace){
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(freeSpace));
        }
    }
}
