package day33_OOP_AbstractionContinue.Device;

public class Google extends Phone implements Downloadable, AndroidApps{


    public Google(String model, double price, String color, String size, boolean hasPowerButton) {
        super("Google", model, price, color, size, hasPowerButton);
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand() + " " + getModel() + " is downloading apps from " + AppStoreName);
    }
}
