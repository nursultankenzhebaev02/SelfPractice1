package day30_OOP_InheritanceContinue.CryproToken.Device;

public class IPhone extends Phone{

    public IPhone(String brand, String model, String color, int size, double price) {
        super(brand, model, color, size, price);

        setVersion();

    }

    private boolean hasIOS = true;
    private String version;

    public boolean isHasIOS(){

        return hasIOS;

    }

    public void setHasIOS(boolean hasIOS){

        this.hasIOS = hasIOS;

    }

    public String getVersion(){

        return version;

    }

    public void setVersion(){

        this.version = version;

    }

    @Override
    public String toString() {
        return "IPhone{" +
                "hasIOS=" + hasIOS +
                ", version='" + version + '\'' +
                '}';
    }

    public static void main(String[] args) {

        IPhone iPhone = new IPhone("Apple", "IPhone 13", "Red", 20, 20000);


        System.out.println(iPhone);

    }

}
