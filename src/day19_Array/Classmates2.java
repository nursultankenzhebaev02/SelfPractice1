package day19_Array;

public class Classmates2 {

    public static void main(String[] args) {

        String[] myGroup = new String[10];

        myGroup[0] = "\nAaron";
        myGroup[1] = "\nAlex";
        myGroup[2] = "\nAlvin";
        myGroup[3] = "\nAnita";
        myGroup[4] = "\nArben";
        myGroup[5] = "\nArda";
        myGroup[6] = "\nArtem";
        myGroup[7] = "\nBerlinda";
        myGroup[8] = "\nBeryl";
        myGroup[9] = "\nBryan";

        for (int i = 0; i < myGroup.length; i++) {
            String reverse = "";

            for (int j = myGroup[i].length() - 1; j >= 0; j--) {
                char each = myGroup[i].charAt(j);
                reverse += each;

            }

            System.out.println((reverse));

        }

    }
}
