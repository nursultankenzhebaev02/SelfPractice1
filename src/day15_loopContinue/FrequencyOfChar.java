package day15_loopContinue;

import java.util.Scanner;

public class FrequencyOfChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter string");

        String word = input.nextLine().toLowerCase();

        System.out.println("Enter char");

        char word1 = input.next().toLowerCase().charAt(0);

        int word2 = 0;

        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == word1){

                word2++;

            }

        }

        System.out.println("String: " + word + "\nchar: " + word1 + "\nOutput: " + word2);

    }

}
