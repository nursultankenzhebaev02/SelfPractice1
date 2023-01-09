package day29_OOP_inheritance.Employee;

public class Employee {

    private String name, ID, jobTitle;
    private char gender;
    private int age;
    private double salary;


    public String getName(){

        return name;

    }

    public void setName(String name){

        this.name = name;

    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender){

        if (gender == 'M' || gender == 'F'){

        this.gender = gender;

        }else {

            System.err.println("Wrong gender! You are not helicopter 3000!!!");

            System.exit(1);

        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){

        if (age >= 18 && age <= 65){


        }else{

            System.err.println("You are not eligible to work yet");

            System.exit(1);

        }

        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary){

        if (salary < 0) {

            System.err.println("Can not be less than 0!!!");

            System.exit(1);

        }
        this.salary = salary;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID){

        this.ID = ID;

    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle){

        this.jobTitle = jobTitle;

    }

    public void setInfo(String name, char gender, int age, String ID, String jobTitle, double salary) {
        setName(name);
        setJobTitle(jobTitle);
        setGender(gender);
        setAge(age);
        setID(ID);
        setSalary(salary);

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
