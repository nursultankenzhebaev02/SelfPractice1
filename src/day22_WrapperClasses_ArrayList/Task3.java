package day22_WrapperClasses_ArrayList;

import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int[] newArr = insert(arr, 2, 100);

        System.out.println(Arrays.toString(newArr));

    }

    public static int[] insert(int[] array, int index, int element) {

        int[] tempArray = new int[array.length + 1];

        for (int i = 0; i < array.length + 1; i++) {

            if (i < index) {
                tempArray[i] = array[i];
            } else if (i == index) {
                tempArray[i] = element;
            } else {
                tempArray[i] = array[i - 1];

            }

        }

        return tempArray;

    }
}