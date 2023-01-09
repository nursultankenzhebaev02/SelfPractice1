package Day6;

public class Calculator2 {

    public static void main(String[] args) {

        double n1 = 10;
        double n2 = 20;
        char mathOperator = '*';
        boolean validOperator = mathOperator == '+' || mathOperator == '-' || mathOperator == '*' || mathOperator == '/';
        boolean invalidOperator = !validOperator;


        if (mathOperator == '+') {
            System.out.println((int)(n1 + n2));
        }
        if (mathOperator == '-') {
            System.out.println((int)(n1 - n2));
        }
        if (mathOperator == '*') {
            System.out.println((int)(n1 * n2));
        }
        if (mathOperator == '/') {
            System.out.println((int)(n1 / n2));
        }
        if (invalidOperator) {
            System.out.println("invalid operator");
        }
    }
}

