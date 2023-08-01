package Programming_Basic.P05_WhileLoop.ex;

import java.util.Scanner;

public class P06_Cake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int weightCake = Integer.parseInt(sc.nextLine());
        int lengthCake = Integer.parseInt(sc.nextLine());

        int piceOfCake = weightCake * lengthCake;
        boolean cakeFinish = true;

        while (piceOfCake >= 0){
            String command = sc.nextLine();

            if (command.equals("STOP")){
                System.out.printf("%d pieces are left.",piceOfCake);
                cakeFinish = false;
                break;
            }

            int numOfPieces = Integer.parseInt(command);
            numOfPieces -= numOfPieces;
        }
        if (cakeFinish) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(piceOfCake));
        }
    }
}
