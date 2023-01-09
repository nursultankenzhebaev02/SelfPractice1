package day30_OOP_InheritanceContinue.Sport.Planet;

public class Mercury extends Planet{

    public Mercury(String name, String mass, double radius, double surfaceGravity, double surfaceArea, int volume, int population) {
        super(name, mass, radius, surfaceGravity, surfaceArea, volume, population);
    }

    public static void main(String[] args) {

        Mercury mercury = new Mercury("Mercury", "5.972 × 10^24 kg", 6378, 9821241, 223121, 2124446, 0);

        System.out.println(mercury);

    }

}
