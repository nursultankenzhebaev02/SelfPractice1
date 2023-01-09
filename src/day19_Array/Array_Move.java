package day19_Array;

import java.util.Arrays;

public class Array_Move {

    public static void main(String[] args) {

        int array[] = {10, 0, 5, 0, 1, 0};

        for (int i = array.length -1; i >= 0; i--) {

            Arrays.sort(array);

            System.out.println((array[i]));

        }

    }

}
