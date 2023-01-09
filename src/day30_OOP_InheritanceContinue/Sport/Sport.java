package day30_OOP_InheritanceContinue.Sport;

public class Sport {

    private String name, rules;
    private int numberOfPlayers, numberOfReferee;

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {

        if (numberOfPlayers <= 0){

            System.err.println("number of players can not be zero or negative");
            System.exit(1);
        }

        this.numberOfPlayers = numberOfPlayers;
    }

    public int getNumberOfReferee() {
        return numberOfReferee;
    }

    public void setNumberOfReferee(int numberOfReferee) {

        if (numberOfReferee <= 0){

            System.err.println("number of referees can not be zero or negative");
            System.exit(1);
        }

        this.numberOfReferee = numberOfReferee;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public void play(){

        System.out.println(name + " is playing");

    }

    public Sport(String rules, String name, int numberOfPlayers, int numberOfReferee){

        setName(name);
        setRules(rules);
        setNumberOfPlayers(numberOfPlayers);
        setNumberOfReferee(numberOfReferee);

    }

    @Override
    public String toString() {
        return "Sport{" +
                "name='" + name + '\'' +
                ", rules='" + rules + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfReferee=" + numberOfReferee +
                '}';
    }
}
