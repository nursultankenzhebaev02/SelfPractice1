package day41_42_Map;

import java.util.*;

public class MapTask {

    public static void main(String[] args) {

        Map<String, int[]> map = new LinkedHashMap<>();

        map.put("Castiel", new int[] {99, 85, 98, 96, 100});
        map.put("Dean", new int[] {67, 76, 84, 60, 20});
        map.put("Sam", new int[] {80, 91, 94, 92, 89});
        map.put("Crowley", new int[] {81, 79, 75, 77, 62});
        map.put("Bobby", new int[] {82, 99, 100, 85, 60});

        for (Map.Entry <String, int[] > eachEntry : map.entrySet()) {

            System.out.println(eachEntry.getKey() + " = " + Arrays.toString( eachEntry.getValue()));

        }

    }

}
