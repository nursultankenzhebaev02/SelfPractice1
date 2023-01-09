package day9_Scanner;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System. in);

        System.out.println("Enter your hourly rate");

        int hour = input.nextInt();

        System.out.println("Enter hours do you work in a week");

        double week = input.nextDouble();

        System.out.println("Enter the state tax");

        int stateTax = input.nextInt();

        System.out.println("Enter the federal tax");

        int federalTax = input.nextInt();

        double salary = hour * week * 52;

        double stateTaxAfter = salary * stateTax / 100;

        double federalTaxAfter = salary * federalTax / 100;

        double totalTax = stateTaxAfter + federalTaxAfter;

        double salaryAfter = salary - totalTax;

        System.out.println("Your salary is including tax $" + salaryAfter);

/*

10. Crreate a class named SalaryCalculator:
		- Ask the user to enter his/her hourlyRate
        - Ask the user how many hours he/she works in a week
        - Ask the user to enter state tax (in percentage)
        - Ask the user to enter federal tax (in percentage)

         -Calculate the:
                    3.4.1 salary
                    3.4.2 sateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome


 */





    }

}
