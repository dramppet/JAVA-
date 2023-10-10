package Telerik.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Three_Groups_ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String[] strArr = line.split(" ");

        ArrayList<String> group1 = new ArrayList<>();
        ArrayList<String> group2 = new ArrayList<>();
        ArrayList<String> group3 = new ArrayList<>();


        for( String el : strArr){
            int findEl = Integer.parseInt(el);
            if (findEl % 3 == 0){
                group1.add(el);
            } else if (findEl % 3 == 1) {
                group2.add(el);
            } else if (findEl % 3 == 2) {
                group3.add(el);
            }
        }
        System.out.println(String.join(" ", group1));
        System.out.println(String.join(" ",group2));
        System.out.println(String.join(" ",group3));
    }
}
