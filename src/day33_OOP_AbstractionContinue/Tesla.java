package day33_OOP_AbstractionContinue;

public final class Tesla extends Car implements AutoPark {

    public Tesla( String model, String color, int year, double price) {

        super( "Tesla", model,  color, year,price);
    }

    public void selfDrive(){
        System.out.println(getModel() + " is supports self drive" );
    }

    @Override
    public void start() {
        System.out.println("Press the button to start the car");
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
