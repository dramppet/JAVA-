package Telerik.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Symmetric_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count_Array = Integer.parseInt(sc.nextLine());

        for (int i = 0;  i < count_Array; i++){

            String line = sc.nextLine();
            String[] strArray = line.split(" ");

            int[] intArray = new int[strArray.length];

            for(int j = 0; j < strArray.length; j++){
                intArray[j] = Integer.parseInt(strArray[j]);
            }

            boolean symmetric = true;

            for (int k = 0; k < intArray.length / 2; k++){
                if (intArray[k] != intArray[intArray.length - 1 - k]){
                    symmetric = false;
                    break;
                }
            }

            if (symmetric){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
