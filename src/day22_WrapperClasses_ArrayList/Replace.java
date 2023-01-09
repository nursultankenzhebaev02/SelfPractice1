package day22_WrapperClasses_ArrayList;

public class Replace {

    public static int[] replace(int[] array, int index, int newElement){

        for (int i = 0; i < array.length; i++) {

            array[index] = newElement;
            
        }

        return array;

    }

}
