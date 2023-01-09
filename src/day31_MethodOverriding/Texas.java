package day31_MethodOverriding;

public class Texas extends State{

    public Texas(){

        super("Texas","TX","Republican Party","Greg Abbott","Ted Cruz",29000000,6.25);


    }

    public static void main(String[] args) {

        Texas texas = new Texas();

        System.out.println(texas);

    }

}
