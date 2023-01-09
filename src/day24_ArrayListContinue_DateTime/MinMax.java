package day24_ArrayListContinue_DateTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinMax {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8));

        list.removeIf(p -> p == Collections.max(list));
        list.removeIf(p -> p == Collections.min(list));

        System.out.println("max = " + Collections.max(list));


        System.out.println("min = " + Collections.min(list));

    }

}
