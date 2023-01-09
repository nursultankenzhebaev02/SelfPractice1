package day30_OOP_InheritanceContinue.CryproToken.Device;

public class SmartTV extends TV{

    public SmartTV(String brand, String model, String color, int size, double price) {
        super(brand, model, color, size, price);
    }

    private boolean has8k;

    public boolean isHas8k(){

        return has8k;

    }

    public void setHas8k(boolean has8k){

        this.has8k = has8k;

    }

    public static void main(String[] args) {

        SmartTV smartTV = new SmartTV("LG", "SUPERMODERN3000", "Black", 200, 200000);

        smartTV.setHas8k(true);

        System.out.println(smartTV);

    }

}
