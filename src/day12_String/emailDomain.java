package day12_String;

import java.util.Scanner;

public class emailDomain {


    public static void main(String[] args) {

        System.out.println("Please, enter your email");

        domain();

    }
    public static void domain() {

        Scanner input = new Scanner(System.in);

        String email = input.next();

        input.close();

        email = email.substring(email.indexOf('@') +1, email.lastIndexOf('.'));

        System.out.println("Domain is: " + email);


    }



}
