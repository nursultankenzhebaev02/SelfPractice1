package day28_OOP_Encapsulation;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Candy {

    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;

    public Candy(String brand, int quantity, double price, boolean hasPeanuts) {

        setBand(brand);
        setQuantity(quantity);
        setPrice(price);
        setHasPeanuts(hasPeanuts);

    }

        public String getBrand(){

        return brand;

        }

        public void setBand(String brand){

        this.brand = brand;

        }

        public int getQuantity(){

        return quantity;

        }

        public void setQuantity(int quantity){

        if (quantity < 0){
            System.err.println("Quantity of candy can not be set to zero or negative");

            System.exit(1);

            this.quantity = quantity;

        }
        }

        public double getPrice(){

        return price;

        }

        public void setPrice(double price){

        if (price < -1){
            System.err.println("price of candy can not be set to negative");

            System.exit(1);
            this.price = price;
        }

        }

        public boolean getHasPeanut(){

        return hasPeanuts;

        }

        public void setHasPeanuts(boolean hasPeanuts){

        this.hasPeanuts = hasPeanuts;

        }

    @Override
    public String toString() {
        return "Candy{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", hasPeanuts=" + hasPeanuts +
                '}';
    }

    public static void main(String[] args) {

        ArrayList<Candy> list = new ArrayList<>();

        Candy candy = new Candy("Sneakers", 4, 8, true);
        Candy candy2 = new Candy("Raffaelo", 1, 5, true);
        Candy candy3 = new Candy("Albene", 5, 3, false);
        Candy candy4 = new Candy("Paimon", 2, 7, true);
        Candy candy5 = new Candy("Chocolate", 3, 10, false);

        for (Candy each : list) {

            list.addAll(Arrays.asList(candy, candy2, candy3, candy4, candy5));

            System.out.println(each.getBrand() + " $" + each.getPrice());

        }

        System.out.println(candy2);

    }

}
