package day33_OOP_AbstractionContinue.Device;

public class IPhone extends Phone implements Downloadable, AppleApps {


    public IPhone(String model, double price, String color, String size, boolean hasPowerButton) {
        super("Iphone", model, price, color, size, hasPowerButton);
    }

    public void downloadApp() {
        System.out.println(getBrand() + " " + getModel() + " is downloading an app from the " + AppStoreName);
    }
}
