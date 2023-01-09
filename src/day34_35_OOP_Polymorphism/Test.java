package day34_35_OOP_Polymorphism;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {


        //DO NOT TOUCH BELOW
        Scanner s = new Scanner(System.in);
        String word = s.next();

        //WRITE YOUR CODE BELOW

        char firstLetter=word.charAt(0);
        char lastLetter= word.charAt(word.length()-1);
        System.out.println("first letter: "+firstLetter);
        System.out.println("last letter: "+lastLetter);

    }
}
