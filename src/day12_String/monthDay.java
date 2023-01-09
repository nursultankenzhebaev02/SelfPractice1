package day12_String;

import java.util.Scanner;

public class monthDay {

    public static void main(String[] args) {

        month();

    }

    public static void month (){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a month");

        String monthDay2 = input.next();

        String result = "";

         if (monthDay2.equalsIgnoreCase("January"  ) || monthDay2.equalsIgnoreCase("March") || monthDay2.equalsIgnoreCase("May") || monthDay2.equalsIgnoreCase("July") || monthDay2.equalsIgnoreCase("October") || monthDay2.equalsIgnoreCase("December") ) {
             result = "has 31 day";

         } else if (monthDay2.equalsIgnoreCase("April") || monthDay2.equalsIgnoreCase("June") || monthDay2.equalsIgnoreCase("September") || monthDay2.equalsIgnoreCase("November")){
            result = "has 30 day";

         } else if (monthDay2.equalsIgnoreCase("February")){
             result = "has 28 day";
         }

         else {
             result = "Invalid number";
         }

         monthDay2 = monthDay2.substring(0 , 1).toUpperCase() + monthDay2.substring(1).toLowerCase();

        System.out.println(monthDay2 + " " + result);

    }

}
