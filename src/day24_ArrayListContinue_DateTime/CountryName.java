package day24_ArrayListContinue_DateTime;

import java.util.ArrayList;
import java.util.Arrays;

public class CountryName {

    public static void main(String[] args) {

        ArrayList<String> countryNames = new ArrayList<>();

        countryNames.addAll(Arrays.asList("USA", "Turkey", "Uzbekistan", "Kyrgyzstan"));

        countryNames.removeIf(p -> p.length() >= 10);

        System.out.println(countryNames);

    }

}
