package day20_Array_forEach;

public class UniqueChar {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9,};

        String unique = "";

        int result = 0;

        for (int each : arr) {

            for (int each2 : arr) {

                if (each == each2) {

                    result++;
                }
            }

            if (result == 1) {
                unique += each + " ";
            }

        }

        System.out.println(unique);

    }
}