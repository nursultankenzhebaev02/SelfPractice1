package day15_loopContinue;

import java.util.Scanner;

public class Marriage {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Will you marry me?");

        String marryMe = input.next();

        while (!(marryMe.equalsIgnoreCase("Yes") || marryMe.equalsIgnoreCase("No"))){

            System.err.println("Invalid answer, please re-enter");

        }

        if (marryMe.equalsIgnoreCase("yes")){
            System.out.println("Congrats");
        }

        if (marryMe.equalsIgnoreCase("no")){
            System.out.println("Good bye");
        }



    }

    }


