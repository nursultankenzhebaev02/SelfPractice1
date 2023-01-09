package groupTasks;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //WRITE YOUR CODE BELOW

        String reversedString = "";

        if (word.length() < 5){

            System.out.println("Too short");

        }else if(word.length() > 5){

            System.out.println("Too long");

        }else if (word.length() == 5){

            for(int i = word.length()-1; i>=0; i--){

                reversedString = reversedString + word.charAt(i);

            }

            System.out.println(reversedString);
        }

    }
}
