package day31_MethodOverriding.Employee;

public class Employee {

    private String name, companyName, jobTitle, id;
    private char gender;
    private double salary;

    private int age ;

    public String  getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {

        if (!(gender == 'M' || gender == 'F')){

            System.err.println("Incorrect gender!");
            System.exit(1);
        }

        this.gender = gender;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {

        if (salary < 1){

            System.err.println("Incorrect salary amount: " + salary);
            System.exit(1);
        }

        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age <= 0 || age < 18){

            System.err.println("Age can not be set to zero, negative or less than 18!");
            System.exit(1);

        }

        this.age = age;
    }

    public Employee(String name, int age, char gender, String id, String jobTitle, double salary, String programmingLanguage) {
        setName(name);
        setId(id);
        setJobTitle(jobTitle);
        setCompanyName(companyName);
        setAge(age);
        setGender(gender);
        setSalary(salary);
    }

    public void work(){

        System.out.println(name + " is working");

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", salary=" + salary +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
