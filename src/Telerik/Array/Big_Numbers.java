package Telerik.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Big_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size1 = scanner.nextInt();
        int size2 = scanner.nextInt();

        int[] arr1 = readArray(scanner, size1);

        int[] arr2 = readArray(scanner, size2);

        int[] sum = addArrays(arr1, arr2);

        printArray(sum);
    }

    public static int[] readArray(Scanner scanner, int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] addArrays(int[] arr1, int[] arr2) {
        ArrayList<Integer> result = new ArrayList<>();
        int carry = 0;

        int i = 0, j = 0;
        while (i < arr1.length || j < arr2.length || carry > 0) {
            int sum = carry;
            if (i < arr1.length) {
                sum += arr1[i];
                i++;
            }
            if (j < arr2.length) {
                sum += arr2[j];
                j++;
            }
            carry = sum / 10;
            result.add(sum % 10);
        }

        int[] sumArray = new int[result.size()];
        for (i = 0; i < result.size(); i++) {
            sumArray[i] = result.get(i);
        }

        return sumArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i  >= 0) {
                System.out.print(" ");
            }
        }
    }
}