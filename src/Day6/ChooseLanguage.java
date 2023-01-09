package Day6;

public class ChooseLanguage {

    public static void main(String[] args) {

        int lan = 3;
        String language = "";

        if (lan == 1) {
            language = "Hello, thank you for your call";
        }

        if (lan == 2) {
            language = "Hola, gracias para llamar";
        }

        if (lan == 3) {
            language = "Merhaba, aragidiniz icin tesekkurler";
        }

        if (lan == 4) {
            language = "Privet, spacibo za vash zvonok;";
        }

        if (lan == 5) {
            language = "Merci, pour votre appel";
        }

        System.out.println(language);

    }

}

/*

Create a class named ChooseLanguage, Given an integer variable named selection that has a number between 1~5, Write a program that can select the language based on the number that's given in selection and prints the following message:

		for 1: Hello, thank for your call
		for 2: Hola, gracias para llamar
		for 3: Merhaba, aradiginiz icin tesekkurler
		for 4: Privet, spasibo za vash zvonok
		for 5: Merci ,pour votre appel

	Note: Do not use more than one print statement


 */