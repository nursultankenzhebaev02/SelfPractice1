package day30_OOP_InheritanceContinue.Sport;

public class Football extends Sport{

    public Football(String rules, String name, int numberOfPlayers, int numberOfReferee) {
        super(rules, name, numberOfPlayers, numberOfReferee);
    }

    public static void main(String[] args) {

        Football football = new Football("In soccer, players can move the ball in any direction, but they can only use their feet, head, or chest to control and advance the ball. Players are not allowed to use their hands, except for the goalkeeper. Players can run with the ball or pass to teammates to quickly move the ball around the field.",
                "Ronaldo", 12, 4);

        System.out.println(football);

    }

}
