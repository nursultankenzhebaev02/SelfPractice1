package day20_Array_forEach;

public class OddOrEven {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 38, 59, 84, 99};

        int odd = 0;
        int even = 0;

        for (int each : numbers) {

            if (each % 2 == 0) {
                even++;
            }else{
                odd++;
            }

        }

        System.out.println("Even numbers are: "+even);
        System.out.println("Odd numbers are: "+odd);

    }

}
