package Day6;

public class OxygenTank {

    public static void main(String[] args) {

        int oxygen = 45;

        String result = "";

        if (oxygen >= 90) {
            result = "Your tank is full";
        }

        if (oxygen >= 80) {
            result = "Still okay";
        }

        if (oxygen >= 70) {
            result = "Don't go too far";
        }

        if (oxygen >= 60) {
            result = "Start to head back";
        }

        if (oxygen >= 50) {
            result = "Be careful now you at 50%";
        }
        else {
            result = "It's dangerous! Go back!";
        }

        System.out.println(result);

    }

}
/*
Create a class named OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level:
        Above 90 -  Your tank is full
        Above 80 -  Still okay
        Above 70 -  Don't go too far
        Above 60 -  Start to head back
        Above 50 -  Be careful now you at 50%

        USE ONE PRINT STATEMENT ONLY

 */