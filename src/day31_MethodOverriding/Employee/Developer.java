package day31_MethodOverriding.Employee;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, String id, String jobTitle, double salary, String programmingLanguage) {
        super( name, age, gender,  id,  jobTitle, salary, programmingLanguage);
        setSalary(getSalary());
        setProgrammingLanguage(programmingLanguage);
    }

    private String programmingLanguage;

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public void work(){

        System.out.println(getJobTitle() + " " + getName() + " is coding in " + programmingLanguage);

    }

}
