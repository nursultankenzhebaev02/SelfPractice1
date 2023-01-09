package day30_OOP_InheritanceContinue.CryproToken.Device;

public class Computer extends Device{

    public Computer(String brand, String model, String color, int size, double price) {
        super(brand, model, color, size, price);
    }

    public void blueScreen(){
        System.out.println(getClass().getSimpleName()+" just gave a blue screen error. Push button to restart.");
    }
    public void restart(){
        System.out.println(getClass().getSimpleName()+" is restarting.");
    }

}
