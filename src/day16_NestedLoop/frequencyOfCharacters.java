package day16_NestedLoop;

import java.util.Scanner;

public class frequencyOfCharacters {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your string value");

        String abc = input.nextLine();

        String result = "";

        for (int i = 0; i < abc.length(); i++) {

            char ch = abc.charAt(i);
            int count = 0;

            for (int j = 0; j < abc.length(); j++) {

                if (ch == abc.charAt(j)) {

                    count++;

                }

            }

            if (!result.contains("" + ch)) {

                result += ch + "" + count;

            }

        }

        System.out.println(result);

    }

}
