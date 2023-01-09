package day30_OOP_InheritanceContinue.Sport;

public class Basketball extends Sport{

    public Basketball(String rules, String name, int numberOfPlayers, int numberOfReferee) {
        super(rules, name, numberOfPlayers, numberOfReferee);
    }

    public static void main(String[] args) {

        Basketball basketball = new Basketball("1. Only five players per team on the court. In the NBA, WNBA, and NCAA basketball, each team can play a maximum number of five players on the court. If a team breaks this main rule, they will lose possession of the ball. Sometimes this inadvertently happens, particularly at low levels of the game, when substitute players check into the game and others don't leave the court in time. ", "Jordan", 9, 2);

        System.out.println(basketball);

    }

}
