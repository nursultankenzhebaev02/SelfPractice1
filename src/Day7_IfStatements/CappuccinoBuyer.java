package Day7_IfStatements;

public class CappuccinoBuyer {

    public static void main(String[] args) {

        String cappuccino = "Large";

        String result = "";

        if (cappuccino == "Venti" || cappuccino == "Tall" || cappuccino == "Grande") {

            if (cappuccino == "Venti") {
                result = "\"Venti\"\nprice is $4.29\ncalories = 150";

            } else if (cappuccino == "Tall") {
                result = "\"Tall\"\nprice is $3.69\nCalories = 90";

            } else if (cappuccino == "Grande") {
                result = "\"Grande\"\nprice is $3.99\nCalories = 120";
            }

            }else {
                result = "Invalid Size";
            }

            System.out.println(result);

        }

    }


/*

Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino

			Valid sizes are tall, grande, venti and their price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output should be "Invalid Size"

			Note: MUST use nested if

 */