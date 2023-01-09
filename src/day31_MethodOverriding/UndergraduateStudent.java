package day31_MethodOverriding;

public class UndergraduateStudent extends Student{

    public UndergraduateStudent(String name, int age, char gender, String studentID, String fieldOfStudy, String schoolName, char grade) {
        super(name, age, gender, studentID, fieldOfStudy, schoolName, grade);
    }

    public void study(){

        System.out.println("UndergraduateStudent " + getName() + " is not graduating Cydeo");

    }

}
