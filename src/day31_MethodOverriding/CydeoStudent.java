package day31_MethodOverriding;

public class CydeoStudent extends Student{

    private int  groupNumber, batchNumber;
    private String programmingLanguage;


    public CydeoStudent(String name, int age, char gender, String studentID, String fieldOfStudy, String schoolName, char grade, int batchNumber, int groupNumber, String programmingLanguage) {
        super(name, age, gender, studentID, fieldOfStudy, schoolName, grade);
        setBatchNumber(batchNumber);
        setGroupNumber(groupNumber);
        setProgrammingLanguage(programmingLanguage);

    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {

        if (batchNumber <= 0){

            System.err.println("batchNumber and groupNumber should not be set to zero or negative");
            System.exit(1);
        }

        this.batchNumber = batchNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {

        if (groupNumber <= 0){

            System.err.println("batchNumber and groupNumber should not be set to zero or negative");
            System.exit(1);
        }

        this.groupNumber = groupNumber;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {

        if (programmingLanguage == null || programmingLanguage.isEmpty()){

            System.err.println("programmingLanguage should not be set to null or empty");

        }

        this.programmingLanguage = programmingLanguage;
    }

    public void eat(){

        System.out.println(getName() + " is eating");

    }

    public void drink(){

        System.out.println(getName() + " is drinking");

    }

    public void sleep(){

        System.out.println(getName() + " is sleeping");

    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "groupNumber=" + groupNumber +
                ", batchNumber=" + batchNumber +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}


