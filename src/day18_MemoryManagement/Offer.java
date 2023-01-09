package day18_MemoryManagement;

public class Offer {

    public static void main(String[] args) {

        Offer offer = new Offer();

        offer.setInfo("Lol", "One Piece", "worker", 13114124, true, false, true, true );

        System.out.println(offer);

    }

    public String location,
    companyName,
    jobTitle;
    public int salary;
    public boolean hasBenefit,
    hasPTO,
    isWFH,
    isFullTime;



    public void setInfo (String location, String companyName, String jobTitle, int salary,  boolean hasBenefit, boolean hasPTO, boolean isWFH, boolean isFullTime ){

        this.location = location;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.hasPTO = hasPTO;
        this.isWFH = isWFH;
        this.isFullTime = isFullTime;



    }

    public String toString(){

        return "Attributes:" + "\n\tLocation: " + location + "\n\tCompany Name: " + companyName + "\n\tJob Title: " + jobTitle + "\n\tSalary: " + salary
                + "\n\tHas Benefit: " + hasBenefit + "\n\tHas \"PTO\": " + hasPTO + "\n\tIs \"WFH\": " + isWFH + "\n\tIs Full Time: " + isFullTime;

    }

}
