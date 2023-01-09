package day20_Array_forEach;

import java.util.Arrays;

import utilities.ArraysUtility;

public class Reverse2 {

    public static void main(String[] args) {

        String str = "I love Java!!!";

        String[] arr = ArraysUtility.reverse(str.split(" "));

        System.out.println(Arrays.toString(arr));

    }
}