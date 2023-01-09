package day17_ClassAndObject;

public class Calculator {

    public double stateTaxRate;
    public double hourlyRate;
    public double federalTaxRate;
    public double weeklyHours;

    public void setInfo(double hourlyRate, double stateTaxRate, double federalTaxRate, double weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;

    }

    public double salary(){

        return hourlyRate * weeklyHours * 52;

    }

    public double stateTax(){

        return stateTaxRate * salary() / 100;

    }

    public double salaryAfter(){

        return salary() * federalTaxRate / 100;

    }

    public String toString(){

        return "Salary: " + salary() + "\nState Tax: " + stateTaxRate + "\nFederal Tax: " + federalTaxRate + "\nSalary summary: " + salaryAfter();

    }



}