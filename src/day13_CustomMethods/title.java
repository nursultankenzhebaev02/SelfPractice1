package day13_CustomMethods;

public class title {

    public static void main(String[] args) {

        System.out.println(word("reCOgnAtiON"));

    }

    public static String word(String word1){

         word1 = (word1.substring(0,1).toUpperCase() + word1.substring(1).toLowerCase());


        return word1;

    }

}
