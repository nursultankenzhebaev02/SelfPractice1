package day41_42_Map;

import java.time.LocalDate;
import java.util.*;

public class Task3 {

    public static void main(String[] args) {

        Map<String, LocalDate> map = new LinkedHashMap<>();
        map.put("John", LocalDate.of(2018, 9, 5));
        map.put("Antony", LocalDate.of(2012, 7, 29));
        map.put("Jimmy", LocalDate.of(2014, 4, 1));
        map.put("James", LocalDate.of(2016, 11, 2));
        map.put("Josh", LocalDate.of(2020, 5, 15));
        map.put("Cory", LocalDate.of(2015, 6, 19));
        map.put("Anderson", LocalDate.of(2013, 8, 24));
        map.put("Steven", LocalDate.of(2017, 10, 2));

        List<String> list = new ArrayList<>();

        for (Map.Entry<String,LocalDate> eachEntry : map.entrySet()) {

            if (eachEntry.getValue().isBefore(LocalDate.of(2015,1,1))){

                list.add(eachEntry.getKey());

            }

        }

        System.out.println(list);

        System.out.println("--------------------------------------------------------------------------------------------");

        String name = null;

        for (Map.Entry<String,LocalDate> eachEntry : map.entrySet()) {
            if (eachEntry.getValue().isEqual(LocalDate.of(2020, 5, 15))){
                name = (eachEntry.getKey());

            }

        }

        System.out.println(name);

        System.out.println("--------------------------------------------------------------------------------------------");

        int count = 0;

        for (Map.Entry<String,LocalDate> eachEntry : map.entrySet()) {
            if (eachEntry.getValue().isAfter(LocalDate.of(2014,12,31))){
                count++;

            }

        }

        System.out.println("Amount of people who got hired after 2014 is equal to " + count);

        System.out.println("--------------------------------------------------------------------------------------------");

        System.out.println(map);

    }

}
