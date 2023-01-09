package day11_String;

import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double totalToPay = 0,

                totalTip = 0,

                totalPerPerson = 0,

                tipPerPerson = 0;


        System.out.println("Split? Yes or No ");

        String split = input.next();

        System.out.println("Enter the number of people");

        int people = input.nextInt();

        System.out.println("Enter the check amount");

        int amount = input.nextInt();

        System.out.println("Service Quality");

        String quality = input.next();

        input.close();

        if (split.equalsIgnoreCase("Yes")){

            if (quality.equalsIgnoreCase("Excellent")){
                totalTip = amount * 0.25;
                totalToPay = totalTip + amount;
                totalPerPerson = totalToPay / people;
                tipPerPerson = totalTip / people;

            } else if (quality.equalsIgnoreCase("Great")) {
                totalTip = amount * 0.20;
                totalToPay = totalTip + amount;
                totalPerPerson = totalToPay / people;
                tipPerPerson = totalTip / people;

            }

            else if (quality.equalsIgnoreCase("Good")){
                totalTip = amount * 0.15;
                totalToPay = totalTip + amount;
                totalPerPerson = totalToPay / people;
                tipPerPerson = totalTip / people;

            }

            else if (quality.equalsIgnoreCase("Fair")){
                totalTip = amount * 0.10;
                totalToPay = totalTip + amount;
                totalPerPerson = totalToPay / people;
                tipPerPerson = totalTip / people;

            }

            else if (quality.equalsIgnoreCase("Poor")) {
                totalTip = amount * 0.05;
                totalToPay = totalTip + amount;
                totalPerPerson = totalToPay / people;
                tipPerPerson = totalTip / people;
            }

            System.out.println("Number of people entered: " + people);

            System.out.println("Total pay: " + totalToPay);

            System.out.println("Total tip: " + totalTip);

            System.out.println("Total per person: " + totalPerPerson);

            System.out.println("Tip per person: " + tipPerPerson);



        }

    }

}
