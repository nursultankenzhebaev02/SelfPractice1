package day15_loopContinue;

import java.util.Scanner;

public class PosNeg {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, positive = 0, negative = 0;

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter 5 numbers");

            num = input.nextInt();

            if (num > 0) {
                positive++;

            } else if (num < 0) {
                negative++;

            } else {
                System.out.println("zero");
            }

            System.out.println(positive + " positive " + negative + " negative");

        }

    }
}