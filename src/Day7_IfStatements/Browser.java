package Day7_IfStatements;

public class Browser {

    public static void main(String[] args) {

        String browser = "Lalalfo";

        String result = "";

        if (browser == "Edge" || browser == "Firefox" || browser == "Safari" || browser == "Opera" || browser == "Chrome") {

            if (browser == "Edge") {
                result = "Edge Browser is selected";

            } else if (browser == "Firefox") {
                result = "Firefox Browser is selected";

            } else if (browser == "Safari") {
                result = "Safari Browser is selected";

            } else if (browser == "Chrome") {
                result = "Chrome Browser is selected";

            } else if (browser == "Opera") {
                result = "Opera Browser is selected";

            }

            } else {
                result = "Invalid Browser name";
            }

            System.out.println(result);



    }

}
/*

 Create a class called Browser. Write a program that can display the name of selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
        3. if the browser name does not match with the valid browser names, out put should be: Invalid Browser Name

        Ex:
            String browser = "chrome";

        Output:
            Chrome Browser is selected

        Note: MUST use nested if

 */