package Telerik.Array;

import java.util.ArrayList;

public class proba {
    public static void main(String[] args) {

        ArrayList<Integer> lis = new ArrayList<>();

        lis.add(5);
        lis.add(6);
        lis.add(6);
        lis.add(5);

        lis.add(0,1);

        for (int i = 0; i < lis.size(); i++) {
            System.out.println(lis.get(i));
        }
    }
}
