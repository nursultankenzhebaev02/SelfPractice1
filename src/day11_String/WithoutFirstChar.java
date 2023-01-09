package day11_String;

import java.util.Scanner;

public class WithoutFirstChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word");

        String word1 = input.next();

        System.out.println("Enter second word");

        String word2 = input.next();

        word1 = word1.substring(1);

        word2 = word2.substring(1);

        System.out.print(word1 + word2);

    }

}
