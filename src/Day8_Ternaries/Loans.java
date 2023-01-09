package Day8_Ternaries;

public class Loans {

    public static void main(String[] args) {

        double salary = 20.000,
                creditScore = 450;

        String loan = "";

        loan = (salary >= 60.000 && creditScore >= 650) ? "Loan Approved" : "Loan Denied";

        System.out.println(loan);


    }

}

/*

Create a class called Loans, Given two variables salary and credit score, use those given info to determine if you can get a loan.

                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650

                    Otherwise print: "Loan Denied"

              NOTE: MUST USE TERNARY.


 */
