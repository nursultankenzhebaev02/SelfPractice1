package Day6;

public class Character_Identity {

    public static void main(String[] args) {

        char number = 127;

        String result = "";
        String anotherResult = "";

        if (number >= 48 && number <= 57) {
            System.out.println(" ASCII value of this char is digit");
        }

        if (number >= 65 && number <= 90) {
            System.out.println(" ASCII value of this char is Upper case alphabet");
        }

        if (number >= 97 && number <= 122){
            System.out.println(" ASCII value of this char is Lower case alphabet");
        }

        if (number > 126) {
            System.out.println("Error");
        }

        else {
            System.out.println(" ASCII value of this char is Special character");
        }
        

    }

}

/*

Create a class named CharacterIdentity, and write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character


			ch = '1'

		output:
			digit

		HINT: You may wanna check out the numbers of the characters on ASCII table


 */