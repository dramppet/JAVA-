package Telerik.Array;

import java.util.Scanner;

public class Above_the_Main_Diagonal_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count_row = scanner.nextInt();

        long sumAboveDiagonal = 0;

        long[][] matrix = new long[count_row][count_row];

        for (int r = 0; r < count_row; r++) {
            for (int c = 0; c < count_row; c++) {
                matrix[r][c] = (long) Math.pow(2, r + c);
            }
        }

        for (int r = 0; r < matrix.length; r++){
            for(int c = 0; c < matrix[r].length; c++){
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < count_row; i++) {
            for (int j = i; j < count_row; j++) {
                sumAboveDiagonal += matrix[i][j];
            }
        }

        System.out.println(sumAboveDiagonal);

    }
}
