package day29_OOP_inheritance.Employee.Brand.Vehicle;

public class BMW extends Vehicle{

    public static void main(String[] args) {


        BMW bmw = new BMW();

        bmw.setInfo("Japan", "Red", "X5", 2002, 21415986);

        System.out.println(bmw);

    }
}
