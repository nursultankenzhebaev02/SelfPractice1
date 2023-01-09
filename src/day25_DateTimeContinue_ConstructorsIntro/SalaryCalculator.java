package day25_DateTimeContinue_ConstructorsIntro;

public class SalaryCalculator {

    public int hourlyRate;

    public int weeklyHours;

    public int stateTaxRate;

    public int federalTax;

    public SalaryCalculator(int hourlyRate, int weeklyHours, int stateTaxRate, int federalTax) {

        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTax = federalTax;

    }

    public double salary() {
        double salary = hourlyRate * weeklyHours * 52;
        return salary;
    }

    public double stateTax() {
        double stateTaxTotal = salary() * stateTaxRate / 100;
        return stateTaxTotal;
    }

    public double federalTax() {
        double federalTaxTotal = salary() * federalTax / 100;
        return federalTaxTotal;
    }

    public double salaryAfterTax() {
        double salaryAfterTax = salary() - (federalTax() + stateTax());
        return salaryAfterTax;
    }

    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", weeklyHours=" + weeklyHours +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTax +
                ", salary=" + salary() +
                ", stateTax=" + stateTax() +
                ", federalTax=" + federalTax() +
                ", salaryAfterTax=" + salaryAfterTax() +
                '}';
    }

    public static void main(String[] args) {

        SalaryCalculator salaryCalculator = new SalaryCalculator(45, 50, 20, 10);

        System.out.println(salaryCalculator);

    }
}



/*

Task02:
    Create a custom class named SalaryCalculator:
        1.1 Create a class named Salary calculator:
                Attributes:
                    hourlyRate, weeklyHours, stateTaxRate, federalTaxRate

                Add a constructor to set all the fields

                Actions:
                    salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
                    stateTax(): calculates the total state tax
                    federalTax(): calculates the total federal tax
                    salaryAfterTax(): calculates the salary after tax
                    toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object

 */