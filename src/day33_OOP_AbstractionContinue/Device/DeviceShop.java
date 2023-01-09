package day33_OOP_AbstractionContinue.Device;

public class DeviceShop {

    public static void main(String[] args) {

        IPhone iPhone = new IPhone("14 PRO", 1200, "Blue", "6 inch", true);
        Samsung samsung = new Samsung("S22 ULTRA", 1300, "Burgundy", "6.7 inch", true);
        Google google = new Google("Pixel", 2000, "White", "5 inches", true);

        iPhone.turnOn();
        samsung.turnOn();
        google.turnOn();

        System.out.println("-----------------------------------------------------------------------------");

        iPhone.turnOff();
        samsung.turnOff();
        google.turnOff();

        System.out.println("-----------------------------------------------------------------------------");

        iPhone.call(901);
        samsung.call(901);
        google.call(901);

        System.out.println("-----------------------------------------------------------------------------");

        iPhone.text(911);
        samsung.text(911);
        google.text(911);

        System.out.println("-----------------------------------------------------------------------------");

        iPhone.downloadApp();
        samsung.downloadApp();
        google.downloadApp();


    }

}
