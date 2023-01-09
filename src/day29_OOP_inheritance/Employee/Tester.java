package day29_OOP_inheritance.Employee;

public class Tester extends Employee {

    public static void main(String[] args) {

        Tester tester = new Tester();

        tester.setInfo("Aliia", 'F', 20, "ID123", "Tester", 2134151);

        tester.setTesting(tester.testing);

        System.out.println(tester);


    }

    private String testing;

    public String getTesting(){

        return testing;

    }

    public void setTesting(String testing){

        System.out.println(getName() + " is testing");

    }

}


