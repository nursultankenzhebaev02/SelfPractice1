package day23_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveAll {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) == 0){
                list.remove(i);
                list.add(0);

            }

        }

        System.out.println(list);

    }

}
