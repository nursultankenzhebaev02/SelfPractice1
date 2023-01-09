package day30_OOP_InheritanceContinue.Sport.Planet;

public class Moon extends Planet{

    public Moon(String name, String mass, double radius, double surfaceGravity, double surfaceArea, int volume, int population) {
        super(name, mass, radius, surfaceGravity, surfaceArea, volume, population);

    }

    public static void main(String[] args) {

        Moon moon = new Moon("Moon", "5.972 × 10^24 kg", 6378, 98018, 2231, 24446, 1);


        System.out.println(moon);

    }

}
