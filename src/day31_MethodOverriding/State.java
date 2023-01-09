package day31_MethodOverriding;

public class State {

    private String name, abbreviation, politicalParty, governor, senator;
    private int population;
    private double stateTax;

    public State(String name, String abbreviation, String politicalParty, String governor, String senator, int population, double stateTax) {
        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
        setStateTax(stateTax);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name == null || name.isEmpty() || name.isBlank()){

            System.err.println(". name, abbreviation, politicalParty, Governor, and senator can not be null/empty/blank");
            System.exit(1);
        }

        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {

        if (abbreviation == null || abbreviation.isEmpty() || abbreviation.isBlank()){

            System.err.println(". name, abbreviation, politicalParty, Governor, and senator can not be null/empty/blank");
            System.exit(1);
        }

        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {

        if (politicalParty == null || politicalParty.isEmpty() || politicalParty.isBlank()){

            System.err.println(". name, abbreviation, politicalParty, Governor, and senator can not be null/empty/blank");
            System.exit(1);
        }

        this.politicalParty = politicalParty;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {

        if (senator == null || senator.isEmpty() || senator.isBlank()){

            System.err.println(". name, abbreviation, politicalParty, Governor, and senator can not be null/empty/blank");
            System.exit(1);
        }

        this.senator = senator;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {

        if (population <= 0){

            System.err.println("Population can not be zero or negative");
            System.exit(1);

        }

        this.population = population;
    }

    public double getStateTax() {
        return stateTax;
    }

    public void setStateTax(double stateTax) {

        if (stateTax < 0){

            System.err.println("Tax rate can not be negative");
            System.exit(1);
        }

        this.stateTax = stateTax;
    }

    public String getGovernor() {
        return governor;
    }

    public void setGovernor(String governor) {
        this.governor = governor;
    }

    @Override
    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", Governor='" + governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                ", stateTax=" + stateTax +
                '}';
    }
}
