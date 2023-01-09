package day29_OOP_inheritance.Employee.Brand.Vehicle;

public class Mercedes extends Vehicle{

    public static void main(String[] args) {

        Mercedes mercedes = new Mercedes();

        mercedes.setInfo("Japan", "Cyan", "Benz", 21241, 21471);

        System.out.println(mercedes);

    }

}
