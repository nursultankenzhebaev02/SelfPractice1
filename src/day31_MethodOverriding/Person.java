package day31_MethodOverriding;

public class Person {

    private String name;
    private int age;
    private char gender;


    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name == null || name.isEmpty()){

            System.err.println("Name should not be null or empty");
            System.exit(1);

        }

        for (int i = 0; i < name.length(); i++) {

            if (!(Character.isLetter(name.charAt(i)) || Character.isWhitespace(name.charAt(i)))) {

                System.err.println("Name should not contain any special character other than space");
                System.exit(1);

            }
        }
        
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age < 0){

            System.err.println("Age should not be set to negative");

        }

        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {

        if (!(gender == 'M' || gender == 'F')){

            System.err.println("Gender must be valid");

        }

        this.gender = gender;
    }

    public void eat(){
        System.out.println(name+" is eating");
    }
    public void drink(){
        System.out.println(name+" is drinking");
    }
    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
