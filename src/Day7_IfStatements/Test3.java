package Day7_IfStatements;

public class Test3 {

    public static void main(String[] args) {

        boolean x = true;
        boolean y = !x == false;
        boolean z = y;

        if (x) {
            System.out.println("1");
        }
        if (y) {
            System.out.println("2");
        }
        if (z) {
            System.out.println("3");
        }

    }

}
