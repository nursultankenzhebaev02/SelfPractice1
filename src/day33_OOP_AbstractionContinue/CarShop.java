package day33_OOP_AbstractionContinue;

public class CarShop {

    public static void main(String[] args) {


        Toyota toyota = new Toyota("Supra",  "White",1996, 120000);
        Honda honda = new Honda("S2000", "Pink", 2001, 493212);
        Audi audi = new Audi("R8", "Black",2012,  400000);
        Mercedes mercedes = new Mercedes("A5", "Black", 2020, 200000);
        Tesla tesla = new Tesla("Model S", "Silver",2019,  1000000);
        Nio nio = new Nio("R19", "Blue", 2023, 750000);
        CydeoCar cydeoCar = new CydeoCar("Muhtar", "Purple", 2023, 2000001);

        toyota.start();
        honda.start();
        audi.start();
        mercedes.start();
        tesla.start();
        nio.start();
        cydeoCar.start();

        System.out.println("-------------");

        toyota.drive();
        honda.drive();
        audi.drive();
        mercedes.drive();
        tesla.drive();
        nio.drive();
        cydeoCar.drive();

        System.out.println("-------------");

        toyota.stop();
        honda.stop();
        audi.stop();
        mercedes.stop();
        tesla.stop();
        nio.stop();
        cydeoCar.stop(); //

        System.out.println("-------------");

        audi.autoPark();



        System.out.println("-------------");

        tesla.selfDrive();


        cydeoCar.fly();

    }
}