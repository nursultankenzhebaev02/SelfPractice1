package day27_StaticContinue_AccessModifiers.Iphone;

public class CydeoStudent {

    public String name, groupNumber;
    public char gender;
    public int age, batchNumber;

    public static String schoolName, fieldOfStudy, programmingLanguage, secretCode;

    public CydeoStudent(String name, char gender, int age, int batchNumber, String groupNumber){

        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;

    }

    static {

        schoolName = "Cydeo";
        fieldOfStudy = "SDET";
        programmingLanguage = "Java";
        secretCode = "Wooden Spoon";

    }

    public void printSchoolName(){

        System.out.println("School name is: " + schoolName);

    }

    public void printSecretCode(){

        System.out.println("secretCode = " + secretCode);

    }

    public void attendClass(){

        System.out.println(name + " is attending the class");

    }

    public void study(){

        System.out.println(name + " is studying");

    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", groupNumber='" + groupNumber + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                '}';
    }

    public static void main(String[] args) {

        CydeoStudent cydeoStudent = new CydeoStudent("Nurik", 'F', 20, 3141, "PI-314");

        cydeoStudent.printSchoolName();
        cydeoStudent.printSecretCode();
        cydeoStudent.attendClass();
        cydeoStudent.study();

        System.out.println(cydeoStudent);

    }

}
