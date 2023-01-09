package day30_OOP_InheritanceContinue.CryproToken.Device;

public class Desktop extends Computer{

    public Desktop(String brand, String model, String color, int size, double price) {
        super(brand, model, color, size, price);
    }

    private int ramStorage;
    private boolean hasRTX = true;

    public int getRamStorage(){

        return ramStorage;

    }

    public void setRamStorage(){

        System.out.println("ramStorage" + ramStorage);

        this.ramStorage = ramStorage;

    }

    public boolean isHasRTX(){

        return hasRTX;

    }

    public void setHasRTX(boolean hasRTX) {
        this.hasRTX = hasRTX;
    }

    public static void main(String[] args) {

        Desktop desktop = new Desktop("Omen", "17", "Black", 17, 2000);

        desktop.setHasRTX(true);
        desktop.setRamStorage();

        System.out.println(desktop);

    }

}
