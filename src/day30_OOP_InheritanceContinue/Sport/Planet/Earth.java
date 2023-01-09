package day30_OOP_InheritanceContinue.Sport.Planet;

public class Earth extends Planet{

    public Earth(String name, String mass, double radius, double surfaceGravity, double surfaceArea, int volume, int population) {
        super(name, mass, radius, surfaceGravity, surfaceArea, volume, population);
    }

    public static void main(String[] args) {

        Earth earth = new Earth("Earth", "5.972 × 10^24 kg", 6378, 98018, 2231, 24446, 800000000);

        System.out.println(earth);

    }

}
