package day11_String;

import java.util.Scanner;

public class EmailTask2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your email");

        String email = input.next();

        input.close();

        String firstNameToUpper = email.substring(0);

        firstNameToUpper = email.toUpperCase();

        String lastNameToUpper = email.substring(email.indexOf('_') +1);

        lastNameToUpper = email.toUpperCase();

        String firstName = email.substring(0, email.indexOf('_'));

        String lastName = email.substring(email.indexOf('_') + 1, email.indexOf('@'));

        String domain = email.substring(email.indexOf('@') +1, email.indexOf('.'));

        System.out.println("First name: " + firstName);

        System.out.println("Last name: " + lastName);

        System.out.println("Domain: " + domain);

    }

}
