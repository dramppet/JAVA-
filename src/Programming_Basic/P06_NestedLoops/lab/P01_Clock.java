package Programming_Basic.P06_NestedLoops.lab;

public class P01_Clock {
    public static void main(String[] args) {
        for (int h = 0; h <= 23; h++) {
            for (int m = 0; m <= 59; m++) {
                System.out.printf("%d:%d%n",h,m);
            }
        }
    }
}
