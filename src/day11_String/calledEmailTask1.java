package day11_String;

import java.util.Scanner;

public class calledEmailTask1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your email");

        String email = input.next();

        input.close();

        if (email.contains("_")) {

            String firstName = email.substring(0, email.indexOf('_'));

            String lastName = email.substring(email.indexOf('_') + 1, email.indexOf('@'));

            email = email.replaceFirst(lastName, firstName);

            email = email.replaceFirst(firstName, lastName);

            System.out.println(email);

        } else {

            System.out.println(email);

        }

    }
}