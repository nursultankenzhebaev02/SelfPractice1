package day23_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class Combine {

    public static void main(String[] args) {

        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};

        ArrayList <String> lol = new ArrayList<>();

        lol.addAll(Arrays.asList(arr1));
        lol.addAll(Arrays.asList(arr2));

        System.out.println(lol);



    }

}
