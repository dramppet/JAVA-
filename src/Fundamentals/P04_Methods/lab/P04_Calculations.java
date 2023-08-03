package Fundamentals.P04_Methods.lab;

import java.util.Scanner;

public class P04_Calculations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String action = sc.nextLine();
        int firstNumber = Integer.parseInt(sc.nextLine());
        int secondNumber = Integer.parseInt(sc.nextLine());

//        typeCalculation(action, firstNumber, secondNumber);
        System.out.println(typeCalculation(action, firstNumber, secondNumber));
    }

    public static int typeCalculation(String type, int firstNumber, int secondNumber) {
        switch (type) {
            case "add":
                return addMethods(firstNumber, secondNumber);
            case "subtract":
                return subtractMethods(firstNumber,secondNumber);
            case "divide":
                return divideMetohds(firstNumber,secondNumber);
            case "multiply":
                return multiplyMetohds(firstNumber,secondNumber);
            default:
                return 0;
        }

    }

    private static int subtractMethods(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    private static int multiplyMetohds(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    private static int divideMetohds(int firstNumber, int secondNumber) {
        if (secondNumber == 0){
            return 0;
        }else {
            return firstNumber/ secondNumber;
        }
    }

    private static int addMethods(int a, int b) {
       return a + b;
    }
}
