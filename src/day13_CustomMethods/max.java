package day13_CustomMethods;

public class max {

    public static void main(String[] args) {

        System.out.println("The maximum number is " + max(10, 20));

    }

    public static int max(int num1, int num2) {

        if (num1 > num2){
           return num1;
        }

        else {
           return num2;
        }

    }

}
