package day28_OOP_Encapsulation;

public class Square {

    private double side;

    public double getSide(){

        return side;

    }

    public void setSide(double side){

        if (side < 0){

            System.err.println("Invalid entry");

        }

        this.side = side;

    }

    public double calcArea(){

        return getSide() * getSide();

    }

    public Square(double side) {
        setSide(side);
    }

    public double calcPerimeter(){

        return getSide() * 4;

    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    public static void main(String[] args) {

        Square square = new Square(6);

        square.calcArea();
        square.calcPerimeter();

        System.out.println(square);

    }

}
