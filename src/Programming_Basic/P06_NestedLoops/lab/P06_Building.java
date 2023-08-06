package Programming_Basic.P06_NestedLoops.lab;

import java.util.Scanner;

public class P06_Building {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countFloor = sc.nextInt();
        int countRoom = sc.nextInt();

        for (int i = countFloor; i >=1 ; i--) {
            for (int j = 0; j < countRoom; j++) {
                if (i == countFloor){
                    System.out.printf("L%d%d ",i,j);
                }else if(i % 2 == 1){
                    System.out.printf("A%d%d ",i,j);
                }else  {
                    System.out.printf("O%d%d ",i,j);
                }
            }
            System.out.println();
        }
    }
}
