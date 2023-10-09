package Telerik.Array;

import java.util.Scanner;

public class Reversed_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String[] strArray = line.split(" ");

        int[] intArray = new int[strArray.length];

        for (int i = 0; i < strArray.length; i++){
            intArray[i] = Integer.parseInt(strArray[i]);
        }

        for (int i = intArray.length - 1; i >= 0; i--){
            if (i == 0){
                System.out.print(intArray[i]);
            }else {
                System.out.print(intArray[i] + ", ");
            }
        }
    }
}
