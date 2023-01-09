package day21_MultiIDimensionalArray;

public class Love_Arrays {

    public static void main(String[] args) {

        String[][][][][][][][][][]  array = {{{{{{{{{{"I", "Love", "Arrays"}}}}}}}}}};

        for (String[][][][][][][][][] arr10 : array) {

            for (String[][][][][][][][] arr9 : arr10) {

                for (String[][][][][][][] arr8 : arr9) {

                    for (String[][][][][][] arr7 : arr8) {

                        for (String[][][][][] arr6 : arr7) {

                            for (String[][][][] arr5 : arr6) {

                                for (String[][][] arr4 : arr5) {

                                    for (String[][]arr3 : arr4) {

                                        for (String[] arr2 : arr3) {

                                            for (String arr1 : arr2) {

                                                System.out.println(arr1);



                                            }

                                        }

                                    }

                                }

                            }

                        }

                    }

                }

            }

        }

    }

}
