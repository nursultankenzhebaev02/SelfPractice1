package day16_NestedLoop;

import java.util.Scanner;

public class gradeCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score");

        int score = input.nextInt();

        while ( ! (score <= 100 && score >= 0)) {

            System.err.println("Invalid entry, try again");

            score = input.nextInt();

        }

        String grade = (score >= 90) ? "A" : (score >= 80 && score <= 89) ? "B" : (score >= 70 && score <= 79) ? "C" :
                (score >= 60 && score <= 69) ? "D" : "F";

        System.out.println("Your grade is: " + grade);

        System.out.println("-------------------------------------------------------------------------------------------");

        System.out.println("Would you like to continue?");

        String answer = input.next();

        while ( ! (answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("No"))){

            System.err.println("Invalid Entry");

        }

        if (answer.equalsIgnoreCase("No")){

            System.out.println("Thank you for using Cydeo Grade Calculator APP");

        }

    }

}
