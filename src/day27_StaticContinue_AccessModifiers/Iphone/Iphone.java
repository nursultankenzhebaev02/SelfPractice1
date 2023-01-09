package day27_StaticContinue_AccessModifiers.Iphone;

public class Iphone {

    public String color, model;
    public double size, price;
    public static boolean isSmartPhone;
    public static String deignedIn, brand, madeIn, OS;

    public Iphone(String model, String color, double size, double price){

    this.color = color;
    this.model = model;
    this.size = size;
    this.price = price;
    }

    static {

        brand = "Apple";
        isSmartPhone = true;
        deignedIn = "New Jersey";
        madeIn = "China";

    }

    public void  printOperatingSystem(){

        System.out.println("Operating System: " + OS);

    }

    public void call(long phoneNumber){

        System.out.println("To make a call, dial this number: " + phoneNumber);

    }

    public void text(long phoneNumber){

        System.out.println("To sent a message dial this phoneNumber = " + phoneNumber);

    }

    public void faceTime(long phoneNumber){

        System.out.println("To make a video call dial this number = " + phoneNumber);

    }

    public void faceTime(String email){

        System.out.println("To make a face time call, write this email = " + email);

    }

    @Override
    public String toString() {
        return "Iphone{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone 2", "Red", 5, 300);

        Iphone iphone2 = new Iphone("Iphone 12", "Black", 11, 1000);

        Iphone iphone3 = new Iphone("Iphone 13", "Blue", 12, 1500);

        Iphone iphone4 = new Iphone("Iphone 6", "Pink", 7, 600);


        iphone.call(31341);
        iphone2.text(31414);
        iphone3.faceTime(332451);
        iphone4.faceTime("nurik@gmail.com");

        System.out.println("Brand = " + brand);
        System.out.println("Is smartphone = " + isSmartPhone);
        System.out.println("Made in = " + madeIn);
        System.out.println("Designed in = " + deignedIn);

    }

}
