package Telerik.Array;

import java.math.BigInteger;
import java.util.Scanner;

public class Above_The_Main_Diagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count_Row_And_Col = Integer.parseInt(sc.nextLine());

        int[][] matrix = new int[count_Row_And_Col][count_Row_And_Col];

        for (int r = 0; r < count_Row_And_Col; r++) {
            for (int c = 0; c < count_Row_And_Col; c++) {
                matrix[r][c] = (int) Math.pow(2, r + c);
            }
        }

        long sum = 0;
        for (int i = 0; i < count_Row_And_Col; i++) {
            for (int j = i + 1; j < count_Row_And_Col; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println(sum);

    }
}
