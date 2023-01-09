package day16_NestedLoop;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Which bedroom do you want to reserve?");

        String bedroom = input.nextLine();

        while (!(bedroom.equalsIgnoreCase("King")) || (bedroom.equalsIgnoreCase("Queen")) || (bedroom.equalsIgnoreCase("Single"))) {

            System.err.println("Invalid room, please re-enter");

            bedroom = input.nextLine();

        }

        System.out.println("How many nights?");

        int nights = input.nextInt();

        int kingBedPrice = nights * 120;
        int queenBedPrice = nights * 100;
        int singleBedPrice = nights * 80;

        if (bedroom.equalsIgnoreCase("King")) {

            System.out.println("King Bed price is: " + kingBedPrice);

        } else if (bedroom.equalsIgnoreCase("Queen")) {

            System.out.println("Queen Bed price is: " + queenBedPrice);

        } else if (bedroom.equalsIgnoreCase("Single")) {

            System.out.println("Single Bed price is: " + singleBedPrice);

        }

        System.out.println("Would you like reserve another room?");

        String answer = input.next();

        while (!(answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("No"))) {

            System.err.println("Invalid answer!");

        }

        while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {

            System.err.println("invalid answer. please re-enter:");

            answer = new Scanner(System.in).next();

            if (answer.equalsIgnoreCase("no")) {

                System.out.println("Thank you, Bye.");

                break;

            }

        }

    }

}