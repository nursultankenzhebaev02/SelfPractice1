package day31_MethodOverriding;

public class StudentObjects {

    public static void main(String[] args) {

        Person person = new Person("Aliia", 8, 'F');

        System.out.println(person);

        person.eat();
        person.drink();
        person.sleep();

        System.out.println("---------------------------------------------------------------------------------------");

        Student student = new Student("Nurik", 20, 'M', "ID202022", "Java", "Cydeo", 'F');

        System.out.println(student);
        student.eat();
        student.drink();
        student.sleep();

        System.out.println("---------------------------------------------------------------------------------------");

        GraduateStudent graduateStudent = new GraduateStudent("Chynara", 40, 'F', "ID1980", "Python", "Cydeo", 'C' );

        System.out.println(graduateStudent);

        graduateStudent.eat();
        graduateStudent.drink();
        graduateStudent.sleep();

        System.out.println("---------------------------------------------------------------------------------------");

        UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Albina", 17, 'F', "ID2005", "C#", "Cydeo", 'A');

        System.out.println(undergraduateStudent);

        undergraduateStudent.eat();
        undergraduateStudent.drink();
        undergraduateStudent.sleep();

        System.out.println(undergraduateStudent);

        System.out.println("---------------------------------------------------------------------------------------");

        CydeoStudent cydeoStudent = new CydeoStudent("Ravshan", 45, 'M', "ID1976", "C++", "Cydeo", 'C', 3245, 21, "Java");

        System.out.println(cydeoStudent);

        cydeoStudent.eat();
        cydeoStudent.drink();
        cydeoStudent.sleep();

    }

}