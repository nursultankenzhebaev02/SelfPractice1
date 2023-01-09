package day30_OOP_InheritanceContinue.CryproToken.Device;

public class Nokia extends Phone{

    public Nokia(String brand, String model, String color, int size, double price) {
        super(brand, model, color, size, price);
    }

    private boolean hasAOS = false;

    public boolean isHasAOS(){

        return hasAOS;

    }

    public void setHasAOS(boolean hasAOS){

        this.hasAOS = hasAOS;

    }

    public static void main(String[] args) {

        Nokia nokia = new Nokia("Samsung", "S22 Ultra", "Fel", 200, 3913);

        System.out.println(nokia);

    }

}
