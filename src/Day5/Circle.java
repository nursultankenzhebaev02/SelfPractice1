package Day5;

public class Circle {

    public static void main(String[] args) {

        int radius = 5;
        double pi = 3.14,
            area = pi * (radius * radius);
        float perimeter = (float) (2 * pi * radius);

        System.out.println("Area of the circle is " + area);
        System.out.println("Perimeter of the circle is " + perimeter);

    }

}
