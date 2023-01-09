package Day8_Ternaries;

public class CydeoBatches {

    public static void main(String[] args) {


        String batchType = "US morning";

        String result = "";

        if (batchType == "US morning") {
            result = "US morning ===> Class times are 10-5 EST. M, T, Th, F.";

        } else if (batchType == "US evening") {
            result = "US evening ===> Class times are 7-10 EST. M, T, W, Th, S, S";

        } else if (batchType == "EU") {
            result = "EU ===> Class times are  10-5 EST. M, T, W, Th, F.";
        } else {
            result = "Invalid Batch";
        }

        System.out.println(result);

        System.out.println("-----------------------------------------------------------------------------------------------------------");

        switch (batchType) {

            case ("US morning"):
                System.out.println("US morning ===> Class times are 10-5 EST. M, T, Th, F.");
                break;

            case ("US evening"):
                System.out.println("US evening ===> Class times are 7-10 EST. M, T, W, Th, S, S");
                break;

            case ("EU"):
                System.out.println("EU ===> Class times are  10-5 EST. M, T, W, Th, F.");
                break;

            default:
                System.out.println("Invalid Batch");

        }

        System.out.println("---------------------------------------------------------------------------------");


    }

}