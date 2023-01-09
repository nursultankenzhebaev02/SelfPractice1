package day29_OOP_inheritance.Employee.Brand.Vehicle;

public class Toyota extends Vehicle{

    public static void main(String[] args) {

        Toyota toyota = new Toyota();

        toyota.setInfo("Japan", "Red", "Toyota", 2020, 3115623);

        System.out.println(toyota);

    }

}
