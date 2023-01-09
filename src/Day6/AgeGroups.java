package Day6;

public class AgeGroups {

    public static void main(String[] args) {

        int person = 84;

        String thePerson = "";

        if (person >= 1 && person <= 2) {
            thePerson = "infant";
        }

        if (person >= 3 && person <= 5){
            thePerson = "Toddler";
        }

        if (person >= 6 && person <= 9) {
            thePerson = "Pre-Teen";
        }

        if (person >= 13 && person <= 17) {
            thePerson = "Teenager";
        }

        if (person >= 18 && person <= 20) {
            thePerson = "Young Adult";
        }

        if (person >= 21 && person <= 39) {
            thePerson = "Adult";
        }

        if (person >= 40 && person <= 49) {
            thePerson = "Young Middle-Aged Adult";
        }

        if (person >= 50 && person <= 54) {
            thePerson = "Middle-Aged Adult";
        }

        if (person >= 55 && person <= 64) {
            thePerson = "Very Young Senior Citizen";
        }

        if (person >= 65 && person <= 74) {
            thePerson = "Young Senior Citizen";
        }

        if (person >= 75 && person <= 84) {
            thePerson = "Senior Citizen";
        }

        if (person > 84 ) {
            thePerson = "Old Senior Citizen";
        }

        System.out.println(thePerson);

    }

}
/*

6. Create a class named AgeGroups, an integer variable named age is declared and given. write a program that can define the age groups of a person

	             age groups are:
	                    infant (1 - 2)
	                    Toddler (3 - 5),
	                    Kid (6 - 9),
	                    Pre-Teen (10 - 12),
	                    Teenager (13 - 17),
	                    Young Adult (18 - 20),
	                    Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),
	                    Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),
	                    Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)

            Note: Do not use more than one print statement

 */