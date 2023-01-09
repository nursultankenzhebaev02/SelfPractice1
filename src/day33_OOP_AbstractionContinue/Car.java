package day33_OOP_AbstractionContinue;

public abstract class Car {

    private final String make, model;
    private final int year;
    private double price;
    private String color;

    public Car(String make, String model, String color, int year, double price){

        if (make == null || make.isEmpty()){

            System.err.println("Make should be set");
            System.exit(1);
        }
        this.make = make;

        if (model == null || model.isEmpty()){

            System.err.println("Model should be set");
            System.exit(1);
        }
        this.model = model;

        if (year < 1886){

            System.err.println("Invalid year!");
            System.exit(1);
        }
        this.year = year;

    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if (price < 0){

            System.err.println("Price should not be negative");
            System.exit(1);

        }

        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void start();
    public abstract void drive();
    public final void stop(){

        System.out.println(getClass().getSimpleName() + " hit the brakes to stop the car");


    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}

/*

Car Task:
	1. Create an Abstract class named Car:
				Variables:
					make (final), model (final), year (final), price, color

				Encapsulate all the fields

				Add a constructor that can set all the fields

				Condition for setting the fields:
						1. make, model, color can not be null
						2. make, model, color can not be empty
						2. year can not be less than 1886
						2. price can not be negative

				abstract methods:
					start();
					drive();

				none abstract methods:
					stop()
					toString()

 */
