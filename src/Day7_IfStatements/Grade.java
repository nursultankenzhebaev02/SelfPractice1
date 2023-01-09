package Day7_IfStatements;

public class Grade {

    public static void main(String[] args) {

        char grade = 'Q';

        String result = "";

        if(grade == 'A'){
            result = "Excellent";

        } else if (grade == 'B') {
            result = "Great job";

        } else if(grade == 'C'){
            result = "Good";

        } else if(grade == 'D'){
            result = "Passed";

        } else if(grade == 'F'){
            result = "Failed";
        }

        else {
            result = "Invalid";
        }

        System.out.println(result);


    }

}

/*
Create a class named Grade, a char variable named grade is given. write a program to print the following messages:
            'A': Excellent
            'B': Great job
            'C': Good
            'D': Passed
            'F': Failed
        Note: Do not use more than one print statement
NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT

 */