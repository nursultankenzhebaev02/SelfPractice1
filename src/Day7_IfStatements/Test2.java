package Day7_IfStatements;

public class Test2 {

    public static void main(String[] args) {

        char grade = 'A';
        boolean passed = grade == 'A' || grade == 'B';
        boolean passed2 = grade == 'C' || grade == 'D';

        if (passed || passed2) {
            System.out.println("CON");

        }else {
            System.out.println("No");
        }

    }

}
