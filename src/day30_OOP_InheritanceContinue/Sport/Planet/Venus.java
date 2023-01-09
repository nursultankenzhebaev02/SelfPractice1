package day30_OOP_InheritanceContinue.Sport.Planet;

public class Venus extends Planet{

    public Venus(String name, String mass, double radius, double surfaceGravity, double surfaceArea, int volume, int population) {
        super(name, mass, radius, surfaceGravity, surfaceArea, volume, population);
    }

    public static void main(String[] args) {

        Venus venus = new Venus("Venus", "5.972 × 10^24 kg", 6378, 98018, 223411, 2144446, 1);

        System.out.println(venus);

    }

}
