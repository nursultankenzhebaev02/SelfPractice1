package day30_OOP_InheritanceContinue.Sport;

public class americanFootball extends Sport{

    public americanFootball(String rules, String name, int numberOfPlayers, int numberOfReferee) {
        super(rules, name, numberOfPlayers, numberOfReferee);
    }

    public static void main(String[] args) {

        americanFootball americanFootball = new americanFootball("Games last for four 15 minute quarters. A 2 minute break between the 1st & 2nd and 3rd & 4th quarters is had along with a 15 minute rest between 2nd and 3rd quarters (half time). Each team has 4 downs to gain 10 or more yards. They can either throw or run the ball to make the yards.",
                "Messi", 1, 0);

        System.out.println(americanFootball);


    }

}
