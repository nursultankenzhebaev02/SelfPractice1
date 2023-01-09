package day30_OOP_InheritanceContinue.CryproToken.Device;

public class Phone extends Device{

    public Phone(String brand, String model, String color, int size, double price) {
        super(brand, model, color, size, price);
    }


    public void call(long phoneNumber){
        System.out.println(getBrand()+" is calling "+phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println(getBrand()+" is texting "+phoneNumber);
    }

}
