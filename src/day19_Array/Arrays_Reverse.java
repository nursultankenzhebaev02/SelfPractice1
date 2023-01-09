package day19_Array;

public class Arrays_Reverse {

    public static void main(String[] args) {

        String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char [] grades = new char[names.length];

        for (int i = 0; i < names.length; i++) {

            if (scores[i] >= 90 && scores[i] <= 100){

                grades[i] = 'A';

            } else if (scores[i] >= 80 && scores[i] <= 89) {

                grades[i] = 'B';

            }else if (scores[i] >= 70 && scores[i] <= 79){

                grades[i] = 'C';

            }else {

            }

            System.out.println(names[i] + "'s score is " + scores[i] + " and grade is " + grades[i]);

        }

    }

}
