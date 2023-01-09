package day22_WrapperClasses_ArrayList;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        int[] newArray = Replace.replace(arr, 2, 30);

        System.out.println(Arrays.toString(newArray));

    }

}
