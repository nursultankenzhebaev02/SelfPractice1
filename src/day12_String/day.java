package day12_String;

import java.util.Scanner;

public class day {

    public static void main(String[] args) {

        dayClass();

    }

    public static void dayClass(){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");

        int day = input.nextInt();

        String result = "";

        switch (day){

            case 1:
                result = "Monday";
                break;

            case 2:
                result = "Tuesday";
                break;

            case 3:
                result = "Wednesday";
                break;

            case 4:
                result = "Thursday";
                break;

            case 5:
                result = "Friday";
                break;

            case 6:
                result = "Saturday";
                break;

            case 7:
                result = "Sunday";
                break;

            default:
                result = "Invalid";

        }

        System.out.println(result);

    }

}
