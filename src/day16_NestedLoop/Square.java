package day16_NestedLoop;

import java.util.Scanner;

public class Square {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the side of the square: ");

        double side = input.nextDouble();

        if (side < 0){

            System.err.println("Invalid entry");

            System.exit(1);

        }

        double area = side * side,
                perimeter = 4 * side;

        System.out.println("Area = " + area);

        System.out.println("Perimeter = " + perimeter);

        System.out.println("------------------------------------------------------------------------------------");

        System.out.println("Would you like to calculate another Square? Yes / No");

        String answer = input.next();

        while ( ! (answer.equals("yes") || answer.equals("no"))){

            System.err.println("Invalid entry");

            answer = input.next();


        }

        System.out.println("Thank you for using Cydeo Rectangle Calculator APP");

    }



}
