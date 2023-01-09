package day33_OOP_AbstractionContinue;

public final class Audi extends Car implements AutoPark{

    public Audi(String model,  String color,int year, double price) {
        super( "Audi" ,model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Twist the key");
    }

    @Override
    public void drive() {
        System.out.println("Driving " + getModel() + " is cool");
    }


    @Override
    public void autoPark() {
        System.out.println(getModel() + " supports auto park");
    }
}
