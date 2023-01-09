package day22_WrapperClasses_ArrayList;

import java.util.Arrays;

public class Task2 {

    public static int[] replace(int[] array, int oldElement, int newElement) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == oldElement) {
                array[i] = newElement;

            }

        }

        return array;

    }

        public static void main (String[]args){

            int[] arr = {10, 10, 20, 30, 40, 30, 30, 30};

            int[] newArr = replace(arr, 30, 300);

            System.out.println(Arrays.toString(newArr));

        }


}