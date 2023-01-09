package groupTasks;

public class FINRA {

    public static void main(String[] args) {

        int number = 1;
        String result = "";

        if (number % 3 == 0 && number % 5 == 0) {
            result = "FINRA";

        } else if (number % 3 == 0) {
            result = "FIN";

        } else if (number % 5 == 0) {
            result = "RA";

        } else {
            result = "Number = " + number;

        }
        System.out.println(result);

    }

}
