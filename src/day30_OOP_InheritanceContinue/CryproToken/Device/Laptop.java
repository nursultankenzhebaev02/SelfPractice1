package day30_OOP_InheritanceContinue.CryproToken.Device;

public class Laptop extends Computer{

    public Laptop(String brand, String model, String color, int size, double price) {
        super(brand, model, color, size, price);
    }

    private boolean hasGoodBattery;

    public boolean isHasGoodBattery(){

        return hasGoodBattery;

    }

    public void setHasGoodBattery(boolean hasGoodBattery){

        this.hasGoodBattery = hasGoodBattery;

    }

    public static void main(String[] args) {

        Laptop laptop = new Laptop("Omen", "17", "Black", 17, 2000);

        laptop.setHasGoodBattery(true);

        System.out.println(laptop);

    }

}
