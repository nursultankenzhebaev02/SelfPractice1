package day31_MethodOverriding.Employee;

public class TestEmployeeObjects {

    public static void main(String[] args) {

        Tester tester = new Tester("Nurik", 20, 'M', "A99", "Tester", 200000, "Java");

        System.out.println(tester);

        System.out.println("---------------------------------------------------------------------------");


        Developer developer = new Developer("Bektur", 2020, 'M', "Cydeo", "HZ", 'M',  "Java");

        System.out.println(developer);

        System.out.println("---------------------------------------------------------------------------");

        Teacher teacher = new Teacher("Albina", 201012, 'F', "Narimanov", "Loh", 'F', "something");

        System.out.println(teacher);

        System.out.println("---------------------------------------------------------------------------");

        Driver driver = new Driver("Ravshanber", 2010213, 'F', "Alia", "Developer", 'M', "Dev");

        System.out.println(driver);

    }

}
