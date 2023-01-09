package day33_OOP_AbstractionContinue;

public final class Honda extends Car{

    public Honda( String model, String color, int year, double price) {

        super( "Honda" ,model, color,year, price);
    }

    @Override
    public void start() {
        if (getModel().equalsIgnoreCase("Rav-4")){

            System.out.println("Press the button to ignition");

        }else{

            System.out.println("Twist the key");

        }

    }

    @Override
    public void drive() {

        System.out.println("Driving is good");

    }

}
