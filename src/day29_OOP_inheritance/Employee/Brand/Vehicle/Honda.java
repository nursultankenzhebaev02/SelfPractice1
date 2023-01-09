package day29_OOP_inheritance.Employee.Brand.Vehicle;

public class Honda extends Vehicle{

    public static void main(String[] args) {

        Honda honda = new Honda();

        honda.setInfo("Japan", "Grey", "Honda", 2002, 2141456);

        System.out.println(honda);

    }

}
