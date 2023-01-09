package day13_CustomMethods;

public class frequencyOfWord {

    public static void main(String[] args) {

        System.out.println(frequencyWord("Java java jAvA", "java"));

    }

    public static int frequencyWord(String word1, String word2){

        String sentence = word1.toLowerCase().replace(word2,"abc");

        return sentence.length() - word1.length();

    }

}
