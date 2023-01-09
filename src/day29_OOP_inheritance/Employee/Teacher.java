package day29_OOP_inheritance.Employee;

public class Teacher extends Employee {

    public static void main(String[] args) {


        Teacher teacher = new Teacher();

        teacher.setInfo("Albion", 'F', 22, "ID114", "Teacher", 3145156);

        System.out.println(teacher.getName() + " is teaching");

        System.out.println(teacher);

    }

}
