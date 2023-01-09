package day29_OOP_inheritance.Employee.Brand.Vehicle;

public class Vehicle {

    private String make, color, model;
    private int year;
    private double price;

    public void setInfo(String make, String color, String model, int year, double price){

        setMake(make);
        setColor(color);
        setModel(model);
        setYear(year);
        setPrice(price);

    }

    public String getMake() {
        return make;
    }

    public void setMake(String make){

        this.make = make;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {

        if (year <= 0){

            System.err.println("Year can not be zero");
            System.exit(1);
        }

        this.year = year;

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if (price <= 0){

            System.err.println("Price can not be zero");

        }

        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
