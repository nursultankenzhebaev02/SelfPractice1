package day30_OOP_InheritanceContinue.CryproToken.Device;

public class BlackBerry extends Phone{

    public BlackBerry(String brand, String model, String color, int size, double price) {
        super(brand, model, color, size, price);
    }

    public static void main(String[] args) {

        BlackBerry blackBerry = new BlackBerry("Samsung", "S22 Ultra", "Fel", 200, 3913);

        System.out.println(blackBerry);

    }

}
