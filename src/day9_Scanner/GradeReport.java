package day9_Scanner;

import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score");

        int score = input.nextInt();

        String result = "";

        result = (score >= 90 && score <= 100) ? "Your grade is A" : (score >= 80 && score <= 90) ? "Your grade is B" : (score >= 60 && score <= 80) ? "Your grade is B" :
                (score >= 50 && score <= 60) ? "Your grade is " + input : (score >= 0 && score <= 49) ? "Your grade is F" : "Invalid score";

        System.out.println(result);

    }

}

/*

3. Create a class named GradeReport:
            2.1 Ask the user to enter the his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score

 */