package day13_CustomMethods;

public class min {

    public static void main(String[] args) {

        System.out.println("The maximum number is " + min(10, 20));

    }

    public static int min(int num1, int num2) {

        if (num1 < num2){
            return num1;
        }

        else {
            return num2;
        }

    }

}
