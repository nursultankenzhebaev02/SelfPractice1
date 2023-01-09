package Day5;

public class SwapTwoVariable {

    public static void main(String[] args) {

        int x = 10,
                y = 15;

        System.out.println("\t\tBefore Swap\t\t");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int z = x;
        x = y;
        y = z + z;

        System.out.println("\t\tAfter Swap\t\t");
        System.out.println("x = " + x);
        System.out.println("z = " + y);


    }

}
