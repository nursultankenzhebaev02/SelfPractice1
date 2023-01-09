package Day6;

public class PosNegZero {

    public static void main(String[] args) {
        int number = 20;

        boolean Positive = number > 0;
        boolean Negative = number < 0;
        boolean Zero = number == 0;


        if (number > 0){
            System.out.println("Positive");
        }
        if (number < 0) {
            System.out.println("Negative");
        }
        if(number == 0){
            System.out.println("Zero");
        }


        System.out.println(number);

    }
}


