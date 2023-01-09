package day30_OOP_InheritanceContinue.CryproToken.Device;

public class Samsung extends Phone{

    public Samsung(String brand, String model, String color, int size, double price) {
        super(brand, model, color, size, price);
    }

    private String freeze;

    public String getFreeze() {
        return freeze;
    }

    public void setFreeze(String freeze) {

        System.out.println(getBrand() + " freezes a lot");

        this.freeze = freeze;

    }

    public static void main(String[] args) {

        Samsung samsung = new Samsung("Samsung", "S22 Ultra", "Fel", 200, 3913);

        samsung.getFreeze();

        System.out.println(samsung);

    }

}
