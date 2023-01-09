package day13_CustomMethods;

public class Combine {

    public static void main(String[] args) {


        System.out.println(combineWords("one", "eight"));



    }

    public static String combineWords(String word1, String word2) {


        int word1LastIndex = word1.length() - 1; // w1 last word index

        char word2First = word2.charAt(0);

        char word1Last = word1.charAt(word1LastIndex);



        if (word1Last == word2First) {
            System.out.println(word1 + word2.substring(1));

            return word1;
        }

        return word2;


    }
    }


