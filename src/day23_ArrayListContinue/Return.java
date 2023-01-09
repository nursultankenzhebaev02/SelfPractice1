package day23_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class Return {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8,8));
        int n = 5;
        int max = list.get(0);

        for (int i = 0; i < n -1 ; i++) {

            if (list.get(i) > max){

                max = list.get(i);

            }
            
        }

        System.out.println(max);

    }
}