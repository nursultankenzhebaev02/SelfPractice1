package day21_MultiIDimensionalArray;

public class Task2 {

    public static void main(String[] args) {

        String result = "";

        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}};

        for (int i = 0; i < items.length ; i++) {

            for (int j = 0; j < items.length ; j++) {

                result += items[i][j] + "\t";

            }

        }

        System.out.println("-----------------------------------------------------------------------");

        for (int i = 0; i < items.length; i++) {

            for (int j = items[i].length -1; j >= 0; j--) {

                result += items[i][j] + "\t";
                
            }
            
        }

        System.out.println("-----------------------------------------------------------------------");

        for (int i = items.length -1; i >= 0; i--) {

            for (int j = 0; j <items.length ; j++) {

                result += items[i][j] + "\t";

            }

        }

        System.out.println(result);

    }

}
