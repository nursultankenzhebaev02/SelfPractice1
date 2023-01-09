package day29_OOP_inheritance.Employee;

public class Driver extends Employee{

    public static void main(String[] args) {

        Driver driver = new Driver();

        driver.setInfo("Aziret", 'M', 35, "ID31157", "Driver", 5815721);

        System.out.println(driver.getName() + " is driving");

        System.out.println(driver);

    }

}
