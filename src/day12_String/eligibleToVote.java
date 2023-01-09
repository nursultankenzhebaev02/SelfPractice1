package day12_String;

import java.util.Scanner;

public class eligibleToVote {

    public static void main(String[] args) {

        eligibleToVoteClass();

    }

    public static void eligibleToVoteClass() {

        Scanner input = new Scanner(System.in);

        System.out.println("How old are you?");

        int age = input.nextInt();

        System.out.println("Are you American? (true or false)");

        boolean isAmerican = input.nextBoolean();

        if (age >= 21 && isAmerican == true) {
            System.out.println("You are eligible to vote");
        }

        else {
            System.out.println("You are not eligible to vote");
        }


    }

}
