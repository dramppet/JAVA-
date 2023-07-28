package Programming_Basic.P03_ConditionalStatementsAdvanced.ex;

import java.util.Optional;
import java.util.Scanner;

public class P06_OperationBetweenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = Integer.parseInt(sc.nextLine());
        int num2 = Integer.parseInt(sc.nextLine());
        char operator = sc.nextLine().charAt(0);

        if (num2 == 0 && (operator == '/' || operator == '%')) {
            System.out.printf("Cannot divide %d by zero", num2);
        } else {
            double result = 0.0;
            switch (operator) {
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = (double) num1 / num2;
                    break;
                case '%':
                    result = num1 % num2;
                    break;
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
            }
            if (operator == '*' || operator == '+' || operator == '-'){
                String evenOrOdd = result % 2 == 0 ? "even" : "odd";
                              System.out.printf("%d %c %d = %.0f - %s",num1, operator, num2, result, evenOrOdd);
            }else if (operator == '/'){
                System.out.printf("%d %c %d = %.2f", num1, operator, num2, result);
            }else {
                System.out.printf("%d %c %d = %.0f", num1, operator, num2, result);

            }
        }


    }
}
