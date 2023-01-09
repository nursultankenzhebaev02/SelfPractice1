package Day5;

public class SwapTwoVariable_2 {

    public static void main(String[] args) {

        int x = 10, y = 15;

        System.out.println("\t\tBefore Swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        x = x * y; //150
        y = x / y; //15
        x /= y;
        y += y;


        System.out.println("\t\tAfter Swap\t\t");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }

}
