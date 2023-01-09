package day27_StaticContinue_AccessModifiers.Iphone;

public class Dog {

    public String breed, color, size;
    public char gender;
    public int age;
    public boolean isFriendly;

    public static int numberOfLegs, numberOfEyes, numberOfWings;


    public Dog (String breed, String size, String color, char gender, int age, boolean isFriendly){

        this.breed = breed;
        this.size = size;
        this.color = color;
        this.gender = gender;
        this.age = age;
        this.isFriendly = isFriendly;

    }

    static {

        numberOfLegs = 4;
        numberOfEyes = 6;
        numberOfWings = 2;

    }

    public void eat(String food){

        System.out.println(color + " " + breed + " eating " + food);

    }

    public void drink(String liquid){

        System.out.println(color + " " + breed + " drinking " + liquid);

    }

    public void sleep(){

        System.out.println(color + " " + breed + " is sleeping");

    }

    public void play(String toy){

        System.out.println(color + " " + breed + " is playing with a " + toy);

    }

    public void bark(){

        System.out.println(color + " " + breed + " is barking to a robber ");

    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", isFriendly=" + isFriendly +
                '}';
    }

    public static void main(String[] args) {

        Dog dog = new Dog("Husky", "Big", "White", 'F', 4, true);

        dog.eat("dog food");
        dog.drink("water");
        dog.sleep();
        dog.play("ball");
        dog.bark();

        System.out.println(dog);
    }

}
