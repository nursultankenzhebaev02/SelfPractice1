package day20_Array_forEach;

public class CommonElem {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {4,5,6,7,8};

        String result = " ";

        for (int each : arr1) {
            for (int each1 : arr2) {

                if (each == each1){
                    result += each + " ";
                }

            }

        }

        System.out.println("Common: " + result);
    }

}
