package day26_DateTime_Static;

public class CydeoStudent {

    public String name, id, batchGroup;
    public int age, grade, batchNumber;
    public char gender;

    public static String schoolName = "Wooden";
    public static String magicWord = "Spoon";
    public static String progLanguage = "Java";

    public CydeoStudent(String name, String id, String batchGroup, int age, int batchNumber, char gender,String schoolName, String magicWord, String progLanguage){

    this.name = name;
    this.id = id;
    this.batchGroup = batchGroup;
    this.age = age;
    this.batchNumber = batchNumber;
    this.gender = gender;
    this.schoolName = schoolName;
    this.magicWord = magicWord;
    this.progLanguage = progLanguage;

    }

    public void study(){

        System.out.println(name + " is studying");

    }

    public void attendClass(){

        System.out.println(name + " is attending to the live classes");

    }

    public static void printSchoolName(){

        System.out.println("The school name is: " + schoolName);

    }

    public static void printProgLanguage(){

        System.out.println("The programming language is " + progLanguage);

    }

    public String toString(){

        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                ", batchGroup=" + batchGroup +
                ", batchNumber=" + batchNumber +
                ", gender=" + gender +
                ", grade=" + grade +
                '}';

    }

    public static void main(String[] args) {

        CydeoStudent cydeoStudent = new CydeoStudent("Nurik", "jerk123", "Cydeo", 20, 2103, 'P', schoolName, magicWord, progLanguage);

        cydeoStudent.study();
        cydeoStudent.attendClass();

        CydeoStudent.printSchoolName();
        CydeoStudent.printProgLanguage();

        System.out.println(cydeoStudent);


    }


}
/*

1. CydeoStudent Task
		1. Create a class named CydeoStudent:

				Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, magicWord

				Add a constructor that can set All the fields (instances)

				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgLanguage(): displays the name of programming language
					toString()

 */