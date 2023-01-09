package day17_ClassAndObject;

public class AddressMain {

    public static void main(String[] args) {

        Address ad = new Address();

        System.out.println(ad);

        ad.setInfo("1023", "PA" , "Lockart", "Phila", "12331" );

        System.out.println("\t"+ad.buildingNumber+" "+ad.street+"\n\t"+ ad.city+" "+ ad.state+", "+ ad.zipCode);


    }

}
