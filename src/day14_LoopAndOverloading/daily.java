package day14_LoopAndOverloading;

public class daily {

    public static void main(String[] args) {

        boolean x, z = true;
        int y = 20;

        x = (y != 10) || (z = false);

        System.out.println("x is: " + x);
        System.out.println("z is: " + z);

    }

}
