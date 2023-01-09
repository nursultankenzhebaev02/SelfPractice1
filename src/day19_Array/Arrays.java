package day19_Array;

public class Arrays {

    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        int indexOf = 0;
        boolean isContains = false;

        for (int i = 0; i < items.length; i++) {


            if (items[i].equals("Gloves")) {

            }

            if (items[i].equals("iPad")) {

                isContains = true;

            }

            System.out.println("Item: " + items[i] + " Price: $" + prices[i] + " ItemID: " + itemIDs[i]);

        }
    }

}
