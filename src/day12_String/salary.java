package day12_String;

import java.util.Scanner;

public class salary {

    public static void main(String[] args) {

        salaryClass();

    }

    public static void salaryClass() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your hourly rate");

        double hourlyRate = input.nextDouble();

        System.out.println("Enter your weekly hours");

        double weeklyHours = input.nextDouble();

        double gross = hourlyRate * weeklyHours * 52;

        System.out.println("You make $" + hourlyRate + " per hour");

        System.out.println("You work " + weeklyHours + " hours in week");

        System.out.println("Your gross income is $" + gross);

    }

}
