package day31_MethodOverriding;

public class GraduateStudent extends Student{

    public GraduateStudent(String name, int age, char gender, String studentID, String fieldOfStudy, String schoolName, char grade) {
        super(name, age, gender, studentID, fieldOfStudy, schoolName, grade);
    }

    public void study(){

        System.out.println("Graduate Student " + getName() + " is graduating Cydeo");

    }
}
