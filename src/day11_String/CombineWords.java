package day11_String;

import java.util.Scanner;

public class CombineWords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word");

        String word1 = input.next();

        System.out.println("Enter second word");

        String word2 = input.next();

        int word1LastIndex = word1.length() - 1; // w1 last word index

        char word2First = word2.charAt(0);

        char word1Last = word1.charAt(word1LastIndex);

        System.out.println("word1Last = " + word1Last);

        System.out.println("word2First = " + word2First);

        if (word1Last == word2First){
            System.out.println(word1 + word2.substring(1)); }


    }

}
