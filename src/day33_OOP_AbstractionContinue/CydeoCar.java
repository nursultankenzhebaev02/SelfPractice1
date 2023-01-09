package day33_OOP_AbstractionContinue;

public final class CydeoCar extends Car implements AutoPark, AutoPilot, Flyable {

    public CydeoCar( String model,  String color,int year, double price) {
        super("CydeoCar", model, color, year, price);
    }


    @Override
    public void autoPark() {
        System.out.println(getModel() + " supports auto parking");
    }

    @Override
    public void selfDrive() {
        System.out.println(getModel() + " supports self driving");
    }

    @Override
    public void start() {
        System.out.println("Press the button to ignite " + getModel());
    }

    @Override
    public void drive() {
        System.out.println(getModel() + " is comfortable");
    }

    @Override
    public void fly() {
        System.out.println(getModel() + " can fly like in the fairies");
    }
}

