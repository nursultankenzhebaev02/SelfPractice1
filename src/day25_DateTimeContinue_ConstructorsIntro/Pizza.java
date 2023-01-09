package day25_DateTimeContinue_ConstructorsIntro;

public class Pizza {

    public char size;

    public int numberOfCheeseTopping;

    public int numberOfPepperoniTopping;

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping){

        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;


    }

    public double calCost(){

        double totalCost = 0;

        switch (size){

            case 'S':
                totalCost = 10 + numberOfPepperoniTopping * 2 + numberOfCheeseTopping * 2;
                break;

            case 'M':
                totalCost = 12 + numberOfPepperoniTopping * 2 + numberOfCheeseTopping * 2;
                break;

            case 'L':
                totalCost = 14 + numberOfPepperoniTopping * 2 + numberOfCheeseTopping * 2;
        }

        return totalCost;

    }

    public String toString(){

        return "Pizza{" + " size " + "\"" + size + "\"" + " numberOfPepperoniTopping " + "\"" + numberOfPepperoniTopping + "\"" + " numberOfCheeseTopping " + "\"" + numberOfCheeseTopping + "\"" + " \nTotal cost: " + calCost();

    }

    public static void main(String[] args) {

        Pizza pizza = new Pizza('L', 2, 4);

        System.out.println("pizza = " + pizza);

    }

}

/*

Task01:
    Create a custom class named Pizza:
        Attributes:
            size, numberOfCheeseTopping, numberOfPepperoniTopping

            Add a constructor that can set all the fields

        Actions:
            calcCost(): returns the totalCost of the pizza
            toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

        Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping

 */
