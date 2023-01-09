package day23_ArrayListContinue;

import java.util.ArrayList;

public class toZero {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.set(list.size()-4, 0);

        System.out.println(list);

    }
}