package day16_NestedLoop;

public class nestedLoop {

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'Z'; i++) {

            for (char j = 'a'; j <= 'z'; j++) {

                System.out.print(" " + i + j);

            }

            System.out.println();

        }

    }
}