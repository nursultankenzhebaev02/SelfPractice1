package day9_Scanner;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System. in);

        char mathOperator1 = '+';
        char mathOperator2 = '-';
        char mathOperator3 = '*';
        char mathOperator4 = '/';

        System.out.println("Enter the first number");

        double number1 = input.nextDouble();

        System.out.println("Enter the math operator");

        char mathOperator = input.next().charAt(0);

        if (mathOperator != mathOperator1 && mathOperator != mathOperator2 && mathOperator != mathOperator3 && mathOperator != mathOperator4) {

            System.out.println("Invalid math operator");

        }else {

            System.out.println("Enter the second number");

            double number2 = input.nextDouble();

            if (mathOperator == '+') {
                System.out.println(number1 + number2);
            }

            if (mathOperator == '-') {
                System.out.println(number1 - number2);
            }

            if (mathOperator == '*') {
                System.out.println(number1 * number2);
            }

            if (mathOperator == '/') {
                System.out.println(number1 / number2);
            }
        }




    }

}
