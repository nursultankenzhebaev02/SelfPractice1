package day21_MultiIDimensionalArray;

public class CydeoStudents {

    public static void main(String[] args) {

        String[] batch1Group1 = {"Ahmet", "Baturay", "Beyza", "Dilara", "Muhtar"};
        String[] batch1Group2 = {"Entisar", "Ermek", "Esmira", "Gadir", "Hrvoje", "Igor", "Muhtar"};
        String[] batch1Group3 = {"Kramer", "Lorraine", "Lucy", "Madina", "Yasin", "Muhtar"};

        String[][] batch1Groups = new String [3][];

        batch1Groups[0] = batch1Group1;
        batch1Groups[1] = batch1Group2;
        batch1Groups[2] = batch1Group3;

        String[] batch2Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
        String[] batch2Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
        String[] batch2Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

        String[][] batch24Groups = new String[3][];

        batch24Groups[0] = batch2Group1;
        batch24Groups[1] = batch2Group2;
        batch24Groups[2] = batch2Group3;

        String[][][] cydeoStudents = {batch24Groups, batch1Groups };

        for (String[][] eachBatch : cydeoStudents) {

            for (String[] eachGroup : eachBatch) {

                for (String eachStudent : eachGroup) {

                    System.out.println(eachStudent);

                }

            }
        }

    }

}
