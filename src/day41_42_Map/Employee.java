package day41_42_Map;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Employee {

    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);

        int min =  Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        String minName = "";
        String maxName ="";

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            if(eachEntry.getValue() < min){
                min = eachEntry.getValue();
                minName = eachEntry.getKey();
            }
            if(eachEntry.getValue() > max){
                max = eachEntry.getValue();
                maxName =eachEntry.getKey();
            }
        }
        System.out.println(minName+ " : "+ min);
        System.out.println(maxName+" : "+max);
        System.out.println("--------------------------------------------------------------------------------------------------");

        AtomicInteger atomicInteger = new AtomicInteger();

        map.forEach((k, v) -> {
            if (v > 120000 && v < 150000){
                atomicInteger.getAndIncrement();

            }

            System.out.println("Amount of people that makes between 120k - 150k is equal to " + atomicInteger);

        });

        System.out.println("--------------------------------------------------------------------------------------------------");

        List<String > list = new ArrayList<>();

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {

            if (eachEntry.getValue() < 118000){

                list.add(eachEntry.getKey());

                System.out.println(list);

            }

        }

        System.out.println("--------------------------------------------------------------------------------------------------");

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {

            if (eachEntry.getValue() < 120000){

                eachEntry.setValue(eachEntry.getValue() + 10000);

            }

        }

        }

}
