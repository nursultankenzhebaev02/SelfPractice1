package day28_OOP_Encapsulation;

public class Circle {

    private double radius;
    public static double PI;

    static {//static block
        PI = 3.14;
    }

    public Circle(double radius) {//Constructor
        setRadius(radius);
    }

    public double getRadius() {//getter
        return radius;

    }

    private void setRadius(double radius) {

        if (radius < 0){

            System.err.println("radius of the circle can not be zero or negative: " + radius);

        }

        this.radius = radius;

    }

    public double calcArea(){

        return getRadius() * getRadius() * PI;

    }

    public double calcPerimeter(){

        return 2 * radius * PI;

    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + getRadius() +
                "area of circle" + calcArea() +
                "perimeter of circle" + calcPerimeter() +
                '}';
    }

    public static void main(String[] args) {

        Circle circle = new Circle(5.5);

        System.out.println(circle);

    }

}