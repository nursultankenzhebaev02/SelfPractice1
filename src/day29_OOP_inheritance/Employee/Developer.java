package day29_OOP_inheritance.Employee;

public class Developer extends Employee {

    public static void main(String[] args) {

        Developer developer = new Developer();

        developer.setInfo("Fox", 'M', 21, "ID20131",  "Developer", 213414);

        developer.getDeveloping();

        developer.setProgrammingLanguage("Java");

        developer.setDeveloping(developer.developing);

        System.out.println(developer);

    }



    private String programmingLanguage;
    private String developing;

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage){

        if (!(programmingLanguage == "Java" || programmingLanguage == "JavaScript" || programmingLanguage == "Python" || programmingLanguage == "Ruby" || programmingLanguage == "C#" || programmingLanguage == "C++" || programmingLanguage == "Swift")){

            System.err.println("Invalid programming language");
            System.exit(1);
            this.programmingLanguage = programmingLanguage;

        }

    }

    public String getDeveloping(){

        return developing;

    }

    public void setDeveloping(String developing){

        System.out.println(getName() + " is developing");

    }

}
