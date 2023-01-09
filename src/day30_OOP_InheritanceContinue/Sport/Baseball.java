package day30_OOP_InheritanceContinue.Sport;

public class Baseball extends Sport{

    public Baseball(String rules, String name, int numberOfPlayers, int numberOfReferee) {
        super(rules, name, numberOfPlayers, numberOfReferee);
    }

    public static void main(String[] args) {

        Baseball baseball = new Baseball("Baseball has two teams of 9 players.\n" +
                "The fielding team’s positions are made up of a pitcher, catcher, first baseman, second baseman, shortstop, third baseman, and three outfielders at left field, centre field and right field.\n" +
                "Games last for 9 innings of which both teams get to bat once. If the game is a tie after 9 innings then an extra inning will be added until a winner is found. If the team batting second in the bottom of the 9th inning are already ahead in points, then they do not need to complete their batting innings.",
                "Makovskiy",5, 1);

    }

}
