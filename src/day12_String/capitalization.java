package day12_String;

import java.util.Scanner;

public class capitalization {

    public static void main(String[] args) {


    name();

    }

    public static void name() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");

        String firstName = input.next();

        System.out.println("Enter your last name");

        String lastName = input.next();

        firstName = firstName.substring(0 , 1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0 , 1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println(firstName + " " + lastName);



    }

}