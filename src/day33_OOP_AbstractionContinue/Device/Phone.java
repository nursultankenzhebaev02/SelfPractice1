package day33_OOP_AbstractionContinue.Device;

public abstract class Phone extends Device{

    public Phone(String brand, String model, double price, String color, String size, boolean hasPowerButton) {
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

    public void call(long phoneNum){
        System.out.println(getBrand() + " " + getModel() + " is calling to " + phoneNum);
    }

    public void text(long phoneNum){
        System.out.println(getBrand() + " " + getModel() + " is texting to " + phoneNum);
    }

}
