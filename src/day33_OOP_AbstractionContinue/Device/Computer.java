package day33_OOP_AbstractionContinue.Device;

public abstract class Computer extends Device{

    public Computer(String brand, String model, double price, String color, String size, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasPowerButton);
    }

    @Override
    protected void turnOn() {
        System.out.println(getBrand() + " " + getModel() + " turning on after pressing the side button");
    }

    @Override
    protected void turnOff() {
        System.out.println(getBrand() + " " + getModel() + " turning on after pressing the side button");
    }

    public void computer(String better){
        System.out.println("Computer is better than " + getBrand());
    }

}
