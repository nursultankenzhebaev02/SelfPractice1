package day29_OOP_inheritance.Employee.Brand;

public class Iphone extends Brand {

    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        iphone.setInfo( "Apple","13 pro max", "6 inches", "Red", 31294);

        iphone.setBrand("Apple");
        iphone.getCall();
        iphone.getText();
        iphone.faceTime("nurik@gmail.com");
        iphone.faceTime(3415151);

        System.out.println(iphone);

    }

    public void faceTime(long phoneNumber){
        System.out.println("Your "+getBrand()+" "+getModel()+" is FaceTiming: "+phoneNumber);
    }
    public void faceTime(String email){
        System.out.println("Your "+getBrand()+" "+getModel()+" is FaceTiming: "+email);
    }

}
