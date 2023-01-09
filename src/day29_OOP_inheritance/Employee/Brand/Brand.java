package day29_OOP_inheritance.Employee.Brand;

public class Brand {

    private String brand, model, size, color;
    private double price;

    private long call;
    private long text;



    public void setInfo( String brand,String model, String size, String color, double price){

        setBrand(brand);
        setColor(color);
        setModel(model);
        setPrice(price);
        setSize(size);

    }

    public long getCall() {
        return call;
    }

    public long getText() {
        return text;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand){

        if (brand == null || brand == " "){
            System.err.println("brand can not be null/empty/blank");
            System.exit(1);

        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model){

        if (model.isBlank() || model.isEmpty()){

            System.err.println("model can not be null/empty/blank");
            System.exit(1);

        }

        this.model = model;

    }

    public String getSize() {
        return size;
    }

    public void setSize(String size){

        if (size.isEmpty() || size.isBlank()){

            System.err.println("model can not be null/empty/blank");
            System.exit(1);
        }

        this.size = size;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if (price < 0){

            System.err.println("Price can not be zero or negative");
            System.exit(1);
        }
        this.price = price;
    }


    public void setCall(long call){

        System.out.println(3157236);

        this.call = call;

    }

    public void setText(long text) {
        this.text = text;
        System.out.println(14618515);

    }

    @Override
    public String toString() {
        return "Brand{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
