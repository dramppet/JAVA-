package Fundamentals.P02_DataTypesAndVariables.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P07_ReversedChars {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char firstChar = br.readLine().charAt(0);
        char second = br.readLine().charAt(0);
        char third = br.readLine().charAt(0);

        System.out.printf("%c %c %c",third,second,firstChar);
    }
}
