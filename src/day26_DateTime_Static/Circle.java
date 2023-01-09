package day26_DateTime_Static;

public class Circle {

    public double radius, diameter;
    public static double pi = 3.14;

    public Circle(double radius, double diameter, double pi){

        this.radius = radius;
        this.diameter = (2 * radius);

    }

    public double calcArea(){

        return pi * (radius * radius);

    }

    public double calcPerimeter(){

        return (pi * 2 * radius);

    }

    public static void printPi(){

        System.out.println("π=" + pi);

    }

    public String toString(){

        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", π=" + pi +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';

    }

    public static void main(String[] args) {

        Circle circle = new Circle(5, 2.5, pi);

        Circle.printPi();

        System.out.println(circle);

    }

}
/*

2. Circle Task:
		1. Create a class named Circle:

				Attributes:
					instance: radius, diameter
					static: pi

				Add a constructor that can set All the fields (instances)
					HINT: we only need to know the radius to set the radius & diameter

				Actions:
					calcArea(): returns the area of Circle
					calcPerimeter(): returns the perimeter of Circle
					printPi(): displays PI value
					toString(): displays the radius, diameter, pi, area and perimeter of the circle when the object of circle is passed in the print statement

 */