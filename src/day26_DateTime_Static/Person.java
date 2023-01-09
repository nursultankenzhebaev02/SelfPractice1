package day26_DateTime_Static;

public class Person {

    public String name;
    public int age;
    public char gender;

    public static boolean isHuman = true, hasNose = true, hasWings = false;
    public static int numbersOfHead = 1, numberOfEyes = 2;

    public Person(String name, int age, char gender, boolean isHuman, boolean hasNose, boolean hasWings, int numberOfEyes, int numbersOfHead){

        this.name = name;
        this.age = age;
        this.gender = gender;

    }

    public void eat(String food){

        System.out.println(name + " is eating " + food);

    }

    public void drink(String drink1){

        System.out.println(name + " is drinking " + drink1);

    }

    public void sleep(){

        System.out.println(name + " is sleeping");

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }


    public static void main(String[] args) {

        Person person = new Person("Dean", 26, 'J', isHuman, hasNose, hasWings, numberOfEyes, numbersOfHead);

        person.eat("Beef");
        person.drink("soda");
        person.sleep();

        System.out.println(person.name+" has nose?: "+Person.hasNose);
        System.out.println(person.name+" has wings?: "+Person.hasWings);
        System.out.println(person.name+" is human?: "+Person.isHuman);
        System.out.println(person.name+"'s number of eyes: "+Person.numberOfEyes);
        System.out.println(person.name+"'s number of head: "+Person.numbersOfHead);

        System.out.println(person);

    }

}

/*

3. Person Task:
		1. Create a class named Person:

				Attributes:
					instance: name, age, gender

					static: isHuman(boolean), hasNose(boolean), hasWings (boolean), numberOfHead, numberOfEyes,

				Add a constructor that can set All the fields (instances)


				Actions:
					eat(String food)
					drink(String drink)
					sleep()
					toString()

 */