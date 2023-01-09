package day33_OOP_AbstractionContinue.Device;

public class Samsung extends Phone implements AndroidApps, Downloadable{


    public Samsung(String model, double price, String color, String size, boolean hasPowerButton) {
        super("Samsung", model, price, color, size, hasPowerButton);
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand() + " " + getColor() + " is downloading apps from " + AppStoreName);
    }
}
