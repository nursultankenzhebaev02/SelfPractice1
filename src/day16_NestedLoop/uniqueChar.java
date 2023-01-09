package day16_NestedLoop;

import java.util.Scanner;

public class uniqueChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your string value");

        String str = new Scanner(System.in).next();

                String result = "";

            for (int k = 0; k < str.length() ; k++) {

                char ch = str.charAt(k);
                int count = 0;

                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == ch) {
                        count++;
                    }
                }
                if (count == 1){ // if you want you can find the characters other than unique by increasing count value
                    result += ch;
                }
            }
            System.out.println(result);

    }

}
