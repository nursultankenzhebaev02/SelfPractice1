package day11_String;

import java.util.Locale;
import java.util.Scanner;

public class FirstName {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");

        String firstName = input.next();

        System.out.println("Enter your last name");

        String lastName = input.next();

        String firstNameCharacter = firstName.toUpperCase().substring(0 ,1);

        String lastNameCharacter = lastName.toUpperCase().substring(0 ,1);

        String fn_rest = firstName.substring(1);
        fn_rest = fn_rest.toLowerCase();



        firstName = firstName.toLowerCase();

        lastName = lastName.toLowerCase();

        System.out.println(firstName + " " + lastName);

    }

}
/*

 int firstNameCharacter = firstName.toUpperCase(Locale.ROOT).length() -1;

        int lastNameCharacter = lastName.toUpperCase().length() -1;

        firstName = firstName.toLowerCase();

        lastName = lastName.toLowerCase();

        System.out.println(firstNameCharacter + lastNameCharacter);

        System.out.println(firstName + lastName);

 */