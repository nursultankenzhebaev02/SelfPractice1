package day33_OOP_AbstractionContinue;

public final class BWM extends Car{

    public BWM( String model,  String color,int year, double price) {

        super("BMW", model,  color,year, price);
    }

    @Override
    public void start() {

        if (getModel().equalsIgnoreCase("X5")){

            System.out.println("Press the button");

        }else {

            System.out.println("Twist the key, stupid!!!");

        }

    }

    @Override
    public void drive() {

        System.out.println("Driving BMW " + getModel() + " is pleasure anytime");

    }


}
