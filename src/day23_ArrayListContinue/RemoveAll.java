package day23_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAll {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("John");
        list.add("Nurik");
        list.add("Law");
        list.add("Fox");
        list.add("Ahmed");
        list.add("John");

        list.removeAll(Arrays.asList("John"));

        System.out.println(list);

    }

}
