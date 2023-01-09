package Day8_Ternaries;

public class OxygenTank {

    public static void main(String[] args) {

        int oxygen = 49;

        String remain = "";

        remain = (oxygen >= 90 && oxygen <= 100) ? "Your tank is full" : (oxygen >= 80 && oxygen <= 90) ? "Still okay" : (oxygen >= 70 && oxygen <= 80) ? "Do not go too far" :
                (oxygen >= 60 && oxygen <= 70) ? "Start to head back" : (oxygen >= 50 && oxygen <= 60) ? "Be careful now you at 50%" : "Start going back";

        System.out.println(remain);

    }

}

/*

 Create a class called OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY

            Solution 1: Must use ternary


 */