package day29_OOP_inheritance.Employee.Brand;

public class Samsung extends Brand{

    public static void main(String[] args) {

        Samsung samsung = new Samsung();

        samsung.setInfo( "Samsung","S22 ULTRA", "6 inches", "Blue", 42525);

        samsung.getCall();
        samsung.getText();

        samsung.freeze();

        System.out.println(samsung);

    }

    public void freeze(){

        System.out.println(getBrand() + " always freezes");

    }

}
