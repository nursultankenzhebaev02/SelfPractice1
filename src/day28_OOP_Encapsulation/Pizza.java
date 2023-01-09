package day28_OOP_Encapsulation;

public class Pizza {

    private String size;
    private int numberOfCheeseTopping, numberOfPepperoniTopping;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public String getSize() {

        return size;

    }

    public void setSize(String size) {

        if (size.equalsIgnoreCase("Small") || size.equalsIgnoreCase("Medium") || size.equalsIgnoreCase("Large")) {

        }
        this.size = size;
    }

    public int getNumberOfCheeseTopping() {

        return getNumberOfCheeseTopping();

    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {

        if (this.numberOfCheeseTopping > 3 && size.equalsIgnoreCase("Small")) {

            System.out.println("Can not be more 3");

        } else if (this.numberOfCheeseTopping > 4 && size.equalsIgnoreCase("Medium")) {

            System.out.println("Can not be more 4");

        } else if (this.numberOfCheeseTopping > 5 && size.equalsIgnoreCase("Large")) {

            System.out.println("Can not be more 5");

        }

    }

    public int getNumberOfPepperoniTopping() {

        return getNumberOfPepperoniTopping();

    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {

        if (numberOfCheeseTopping > 0) {
            if (size.equalsIgnoreCase("small") && numberOfCheeseTopping > 3) {
                System.err.println("Topping can not be more than 3");
                System.exit(1);
            } else if (size.equalsIgnoreCase("medium") && numberOfCheeseTopping > 4) {
                System.err.println("Topping can not be more than 4");
                System.exit(1);
            } else if (size.equalsIgnoreCase("large") && numberOfCheeseTopping > 5) {
                System.err.println("Topping can not be more than 5");
                System.exit(1);
            }
        } else {
            System.err.println("Number of topping cannot be negative.");
            System.exit(1);
        }
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }



    public double calcCost(){

        return

        (size.equalsIgnoreCase("Small")) ? (10 + 2 * (getNumberOfCheeseTopping() + getNumberOfPepperoniTopping())) : (size.equalsIgnoreCase("Medium")) ? (12 + 2 * (getNumberOfCheeseTopping() + getNumberOfPepperoniTopping())) :
                 (14 + 2 * (getNumberOfCheeseTopping() + getNumberOfPepperoniTopping()));


    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                '}';
    }

    public static void main(String[] args) {

        Pizza pizza = new Pizza("Large", 5, 10);

        pizza.calcCost();

        System.out.println(pizza);

    }

}
