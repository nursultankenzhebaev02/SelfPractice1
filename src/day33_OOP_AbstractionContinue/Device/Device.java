package day33_OOP_AbstractionContinue.Device;

public abstract class Device {

    private final String brand, model;
    private double price;
    private String color;
    private final String size;
    private boolean hasPowerButton, hasBattery;

    public Device(String brand, String model, double price, String color, String size, boolean hasPowerButton) {

        if (brand == null || brand.isEmpty() || brand.isBlank()) {

            System.err.println("Brand should be set. It can not be empty");
            System.exit(1);
        }
        this.brand = brand;

        if (model == null || model.isBlank() || model.isEmpty()) {

            System.err.println("Model should be set. It can not be empty");
            System.exit(1);
        }
        this.model = model;

        if (price <= 0) {

            System.err.println("Price can not be set to negative or zero");
            System.exit(1);
        }
        this.price = price;

        if (color.isEmpty() || color.isBlank()) {

            System.err.println("Color can not be empty or blank");
            System.exit(1);
        }
        this.color = color;

        if (size.isBlank() || size.isEmpty()) {

            System.err.println("Size should not be empty or blank");
            System.exit(1);
        }
        this.size = size;

        this.hasPowerButton = hasPowerButton;

        this.hasBattery = hasBattery;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    protected abstract void turnOn();
    protected abstract void turnOff();

    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }
}