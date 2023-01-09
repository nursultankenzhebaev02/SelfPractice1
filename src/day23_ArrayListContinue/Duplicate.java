package day23_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class Duplicate {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5));

        list.addAll(list);

        System.out.println(list);

    }

}
