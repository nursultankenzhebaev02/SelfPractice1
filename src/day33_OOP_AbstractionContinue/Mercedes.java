package day33_OOP_AbstractionContinue;

public final class Mercedes extends Car {

    public Mercedes( String model,  String color, int year, double price) {

        super("Audi", model, color,year, price);
    }


    @Override
    public void start() {
        System.out.println(getModel() + " starts with the button");
    }

    @Override
    public void drive() {
        System.out.println(getModel() + " is comfortable");
    }
}
