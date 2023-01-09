package day13_CustomMethods;

public class isEven {

    public static void main(String[] args) {

        System.out.println(even(23));

    }

    public static boolean even(int num) {

        if (num % 2 == 0) {
            return true;
        }
        else {
            return false;
        }

    }
}


