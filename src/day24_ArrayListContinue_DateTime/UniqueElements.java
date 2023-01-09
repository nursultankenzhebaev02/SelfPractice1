package day24_ArrayListContinue_DateTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,1,2,3,3,4,5,5));

        System.out.println(list);

        list.removeIf(p -> Collections.frequency(list,p) !=1);

        System.out.println(list);

        }

    }


