package day24_ArrayListContinue_DateTime;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAll3 {

    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>();

        list.addAll(Arrays.asList( '$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));

        list.removeIf(p -> !Character.isLetterOrDigit(p));

        System.out.println(list);

    }

}
