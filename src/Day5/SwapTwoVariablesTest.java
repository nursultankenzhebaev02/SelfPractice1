package Day5;

public class SwapTwoVariablesTest {

    public static void main(String[] args) {

            int x = 10, y = 15;

            System.out.println("-----Before Swap-----");
            System.out.println("\t\tx = " + x);
            System.out.println("\t\ty = " + y);

            int z = x;
            x = y;
            y = z + z;


            System.out.println("------After swap------");
            System.out.println("\t\tx = " + x);
            System.out.println("\t\ty = " + y);



        }

}
