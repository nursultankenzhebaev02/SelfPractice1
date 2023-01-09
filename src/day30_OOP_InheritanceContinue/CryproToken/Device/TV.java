package day30_OOP_InheritanceContinue.CryproToken.Device;

public class TV extends Device{

    public TV(String brand, String model, String color, int size, double price) {
        super(brand, model, color, size, price);
    }

    public void channelUp(){
        System.out.println("Your "+getBrand()+" "+getClass().getSimpleName()+" went up one channel.");
    }
    public void channelDown(){
        System.out.println("Your "+getBrand()+" "+getClass().getSimpleName()+" went down one channel.");
    }

    }