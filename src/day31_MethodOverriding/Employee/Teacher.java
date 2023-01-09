package day31_MethodOverriding.Employee;

public class Teacher extends Employee{

    public Teacher(String name, int age, char gender, String id, String jobTitle, double salary, String programmingLanguage) {
        super( name,age,  gender,  id,  jobTitle,  salary, programmingLanguage);
        setSalary(getSalary());
    }

    public void work(){

        System.out.println(getName() + " is teaching");

    }

}
