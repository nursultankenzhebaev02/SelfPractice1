package day20_Array_forEach;

public class Palindromes {

    public static void main(String[] args) {

        String[] words = {"anna" , "level", "Java"};

        int palindromes1 = 0;

        for (String each : words) {

         String result = " ";

            for (int i = each.length() - 1; i >= 0; i--) {

                result += each.charAt(i);
            }
            if (each.equals(result)) {
                palindromes1++;

            }

        }

        System.out.println("palindrome = " + palindromes1);

    }

}
