package Programming_Basic.P01_FirstSrepsInCoding.lab;

import java.util.Scanner;

public class P07_Projects_Creation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String name_architect = sc.nextLine();
        int count_projects = sc.nextInt();

        int hours = count_projects * 3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name_architect, hours, count_projects);
    }
}
