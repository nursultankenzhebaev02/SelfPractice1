package day29_OOP_inheritance.Employee.Brand;

public class Nokia extends Brand {

    public static void main(String[] args) {

        Nokia nokia = new Nokia();

        nokia.setInfo("Nokia", "Lala", "2 inches", "Red", 32151);

        nokia.getCall();
        nokia.getText();

        nokia.selfDefence();

        System.out.println(nokia);

    }

    public void selfDefence(){

        System.out.println(getBrand() + " is the best weapon for self defence");

    }

}
