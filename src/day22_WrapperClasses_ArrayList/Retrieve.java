package day22_WrapperClasses_ArrayList;

public class Retrieve {

    public static void main(String[] args) {

        String str = "Wooden Spoon!321";

        String letters = "";
        String digits = "";
        String specialChars = "";

        for (int i = 0; i < str.length(); i++) {

            if( Character.isLetter(str.charAt(i)) ){
                letters += str.charAt(i);
            }

            if(Character.isDigit(str.charAt(i))){
                digits += str.charAt(i);
            }

            if ( !Character.isLetterOrDigit(str.charAt(i))){
                specialChars += str.charAt(i);
            }

        }

        System.out.println("Letters: " + letters);
        System.out.println("Digits: " + digits);
        System.out.println("Special characters: " + specialChars);

    }

    }


