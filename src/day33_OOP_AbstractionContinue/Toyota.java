package day33_OOP_AbstractionContinue;

public final class Toyota extends Car{

    public Toyota(String model,  String color,int year, double price) {
        super( "Toyota" ,model,  color,year, price);
    }

    @Override
    public void start() {
        System.out.println("Twist key and start ignition" + getMake() + " is starting super fast");
    }

    @Override
    public void drive() {
        System.out.println("Driving " + getModel() + " is pleasure");

    }

}
