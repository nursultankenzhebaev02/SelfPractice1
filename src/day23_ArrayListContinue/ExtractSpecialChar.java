package day23_ArrayListContinue;

import java.util.ArrayList;

public class ExtractSpecialChar {

    public static void main(String[] args) {

        String str = "ABCD123$%#@&456EFG?!$";

        ArrayList<Character> list1 = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();
        ArrayList<Character> list3 = new ArrayList<>();

        char[] array = str.toCharArray();

        for (char each : array) {

            if (Character.isDigit(each)){
                list1.add(each);
            }else if (Character.isLetter(each)){
                list2.add(each);
            }else{
                list3.add(each);
            }

        }

        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
        System.out.println("list3 = " + list3);

    }

}
