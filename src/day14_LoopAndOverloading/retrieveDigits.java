package day14_LoopAndOverloading;

import java.util.Scanner;

public class retrieveDigits {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter something");

        String num = input.nextLine();

        String letters = "",
                digits ="",
                specialChars ="";

        for (int i = 0; i <num.length() ; i++) {

            if (num.charAt(i) >= 65 && num.charAt(i) <= 90 || num.charAt(i) >= 97 && num.charAt(i) <= 122){
                letters += num.charAt(i);



            }else if (num.charAt(i) >= 48 && num.charAt(i) <= 57){
                digits += num.charAt(i);



            } else {
                specialChars += num.charAt(i);
            }

        }

        System.out.println("Letters: " + letters);


        System.out.println("Special chars: " + specialChars);


        System.out.println("Digits: " + digits);


    }
    
}
