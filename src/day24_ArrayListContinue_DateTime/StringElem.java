package day24_ArrayListContinue_DateTime;

import java.util.ArrayList;
import java.util.Arrays;

public class StringElem {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.addAll(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"));

        list.removeIf(p -> p.substring(0,1).equalsIgnoreCase(p.substring(p.length() - 1)));

        System.out.println(list);

    }

}
