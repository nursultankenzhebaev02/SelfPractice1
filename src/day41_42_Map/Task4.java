package day41_42_Map;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task4 {

    public static void main(String[] args) {

        String[] group1 = {"Duygu","Magda","Farangez","Edison","Kerem","Farangis"};
        String[] group2 = {"Margie","Vesele","Iryn","Nilufar","Aziza","Nurcan","Raika","Igor","Elif","Sana","Azamat"};
        String[] group3 = {"Alex","Ali","Andriy","Cassandra","Sevgul","Olha","Tito","Ozan","Serkan","Furkan","Madina","Muharrem"};
        String[] group4 = {"Maria","Kristina","Amin","George","Layan","Amin","Yulia","George","Ayanle","Maxim","Nermin","Doughlas"};
        String[] group5 = {"Nazar","Veronika","Mikael","Layla","Badmaa","Zaeir","Anna","Tamara","Eugene"};

        Map<Integer, String[]> groups = new LinkedHashMap<>();

        groups.put(0, group1);
        groups.put(1, group2);
        groups.put(2, group3);
        groups.put(3, group4);
        groups.put(4, group5);

        System.out.println("--------------------------------------------------------------------------------------------");

        groups.forEach((k, v) -> {
           if (k == 1){
               System.out.println(k + " = " + Arrays.toString(v));

           }

        });

        System.out.println("--------------------------------------------------------------------------------------------");

        groups.forEach((k,v) -> {

            for (String eachName : v) {
                System.out.println(eachName);
            }

        });

    }

}
