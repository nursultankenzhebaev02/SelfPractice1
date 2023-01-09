package day30_OOP_InheritanceContinue.CryproToken.Device;

public class Device {

    private String brand, model, color;
    private int size;
    private double price;
    private boolean hasBattery = true, hasPowerButton = true;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {

        if (brand == null || brand.isEmpty() || brand.isBlank()){

            System.err.println("brand, model can not be null, empty or blank");
            System.exit(1);
        }

        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {

        if (model == null || model.isBlank() || model.isEmpty()){

            System.err.println("brand, model can not be null, empty or blank");
            System.exit(1);
        }

        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if (price <= 0){

            System.err.println("Price can not be zero or negative");
            System.exit(1);
        }

        this.price = price;
    }

    public void turnOn(){
        System.out.println(brand+" is turned on.");
    }
    public void turnOff(){
        System.out.println(brand+" is turned off.");
    }

    public Device(String brand, String model, String color, int size, double price) {
        setBrand(brand);
        setModel(model);
        setColor(color);
        setSize(size);
        setPrice(price);
    }

    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", price=" + price +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }
}
