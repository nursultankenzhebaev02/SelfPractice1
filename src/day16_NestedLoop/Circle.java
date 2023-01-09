package day16_NestedLoop;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius of circle");

        double radius = input.nextDouble();

        double diameter = (2 * radius), area = (3.14 * radius * radius), perimeter = (2 * 3.14 * radius);

        while ( ! (radius > 0)){

            System.err.println("Invalid Entry for the radius of the circle");

            System.exit(1);

        }

        if (radius > 0) {

            System.out.println("Diameter of circle is: " + diameter);

            System.out.println("Area of circle is: " + area);

            System.out.println("Perimeter of circle is: " + perimeter);

            System.out.println("-----------------------------------------------------------------------------");

            System.out.println("Would you like to calculate another circle?");

            String answer = input.next();

            while ( ! (answer.equals("yes") || answer.equals("no"))){


                System.err.println("Invalid answer!! Would you like to calculate another circle? yes/no");

            }

            if (answer.equals("no")){

                System.out.println("Thank you for using our tool");

            }

        }

    }

}
