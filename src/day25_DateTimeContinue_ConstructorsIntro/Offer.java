package day25_DateTimeContinue_ConstructorsIntro;

import java.util.ArrayList;
import java.util.Arrays;

public class Offer {

    public String location, companyName, jobTitle;
    public int salary;
    public boolean hasBenefit, hasPTO, isWFH, isFullTime;

    public Offer(String location, String companyName, String jobTitle, int salary, boolean hasBenefit, boolean hasPTO, boolean isWFH, boolean isFullTime) {

        this.location = location;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.hasPTO = hasPTO;
        this.isWFH = isWFH;
        this.isFullTime = isFullTime;

    }

    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hasBenefit=" + hasBenefit +
                ", hasPTO=" + hasPTO +
                ", isWFH=" + isWFH +
                ", isFullTime=" + isFullTime +
                '}';

    }

    public static void main(String[] args) {

        Offer offer1 = (new Offer("New York", "Lol", "Developer", 100000, true, true, true, true));
        Offer offer2 = (new Offer("Philadelphia", "Naruto", "Tester", 200000, false, false, false, false));
        Offer offer3 = (new Offer("Austin", "Apple", "Tester", 200100, false, true, false, true));
        Offer offer4 = (new Offer("Washington", "Umbrella", "Tester", 203000, true, true, true, false));
        Offer offer5 = (new Offer("New Jersey", "Oracle", "Tester", 200050, true, true, false, true));
        Offer offer6 = (new Offer("Boston", "One Piece", "Tester", 130000, false, false, false, true));
        Offer offer7 = (new Offer("Moscow", "Cydeo", "Tester", 20000, false, true, true, true));

        Offer[] myOffers ={offer1, offer2, offer3, offer4, offer5, offer6, offer7};

        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(myOffers));
        fullTimeOffers.removeIf(p -> p.isFullTime == false);

        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p -> p.location.equals("Moscow"));

        ArrayList<Offer> offersWithBenefits = new ArrayList<>(Arrays.asList(myOffers));
        offersWithBenefits.removeIf(p -> p.hasPTO == false);
        offersWithBenefits.removeIf(p -> p.hasBenefit == false);

        ArrayList<Offer> devOffers = new ArrayList<>(Arrays.asList(myOffers));
        devOffers.removeIf(p -> p.jobTitle.equals("Developer"));

        ArrayList<Offer> with100k = new ArrayList<>(Arrays.asList(myOffers));
        with100k.removeIf(p -> p.salary < 100000);

        System.out.println(myOffers);


    }

}
/*

Task05:
    Create a custom class named Offer
            Attributes:
                    location, companyName, jobTitle, salary, hasBenefit, hasPTO, isWFH, isFullTime

                Add a constructor that can set all the fields

            Actions:
                toString(): returns the full info of the Offer Object

    2. Create a class named MyOffers:

            2.1 Create 7 objects of Offer
            2.2 Create an array of Offers named myOffers and store all 7 objects of offers
            2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
                    2.3.1 Write a program that can remove the offer objects that are not full-time
            2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
                    2.4.1 Write a program that can remove all the offers that are not from local
            2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
                    2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO
            2.6 Create an ArrayList of Offer named devOffers and add all the offer objects.
                    2.6.1 Write a program that can remove all the offers that does not contain developer in the jobTitle

            2.7 Create an ArrayList of Offer named offers With100K and add all the offer objects.
                    2.7.1 Write a program that can remove all the offers that are offering less than 100K salary

 */