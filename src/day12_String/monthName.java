package day12_String;

import java.util.Scanner;

public class monthName {

    public static void main(String[] args) {

        monthNameClass();

    }

    public static void monthNameClass() {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");

        int month = input.nextInt();

        String result = "";

        if (month == 1) {
            result = "January";

        } else if (month == 2) {
            result = "February";

        } else if (month == 3) {
            result = "March";

        } else if (month == 4) {
            result = "April";

        } else if (month == 5) {
            result = "May";

        } else if (month == 6) {
            result = "June";

        } else if (month == 7) {
            result = "July";

        } else if (month == 8) {
            result = "August";

        } else if (month == 9) {
            result = "September";

        } else if (month == 10) {
            result = "October";

        } else if (month == 11) {
            result = "November";

        } else if (month == 12) {
            result = "December";
        }
        else {
            result = "Invalid number";
        }

        System.out.println(result);

    }

}