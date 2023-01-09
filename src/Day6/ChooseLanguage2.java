package Day6;

public class ChooseLanguage2 {

    public static void main(String[] args) {
        int number = 2;

        String result = "";

        if (number == 1) {
            result = "Hello, thank for your call";
        }
        if (number == 2) {
            result = "Hola, gracias para llamar";
        }
        if (number == 3) {
            result = "Merhaba, aradiginiz icin tesekkurler";
        }
        if (number == 4) {
            result = "Privet, spasibo za vash zvonok";
        }
        if (number == 5) {
            result = "Merci ,pour votre appel";
        }
        System.out.println(result);
    }
}