package day9_Scanner;

import java.util.Scanner;

public class MilesToKM {

    public static void main(String[] args) {

        Scanner input = new Scanner(System. in);

        System.out.println("Enter the value");

        int miles = input.nextInt();

        double km = miles * 1.609;

        System.out.println(miles + " miles equal to " + km + " kilometers");

        input.close();

    }

}
