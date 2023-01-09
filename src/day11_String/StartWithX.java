package day11_String;

import java.util.Scanner;

public class StartWithX {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");

        String r1 = input.next();

        r1 = r1.replaceFirst("x" , "a");

        System.out.println(r1);

        input.close();


    }

}
