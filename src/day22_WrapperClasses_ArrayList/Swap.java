package day22_WrapperClasses_ArrayList;

import java.util.Arrays;

public class Swap {

    public static int[] swap(int[] array, int i, int j){

        int z = 0;
        z = array [i] ;
        array[i] = array[j];
        array[j] = z;

        return array;

    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int[] newArr = swap(arr, 2, 4);

        System.out.println(Arrays.toString(newArr));

    }

}
