package SimpleTask;

import java.util.Arrays;
import java.util.Collections;

public class BubbleSort {

  // int[] myRandomNumbers = {10, 200, 3, 5, 6, 8, 111, -13, 81, 100};

    public static void bubleMethod(int[] array) {


        int temp;

        for (int a = 1; a < array.length; a++)
            for (int b = array.length - 1; b >= a; b--) {
                if (array[b - 1] > array[b]) {
                    temp = array[b - 1];
                    array[b - 1] = array[b];
                    array[b] = temp;
                }
            }
        System.out.println(Arrays.toString(array));
    }


    public static void sortUpMethod(int[] array) {

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    }


    public static void sortDownMethod(int[] array) {

        Integer[] methodArray = new Integer[array.length];
        int i = 0;
        for (int value : array) {
            methodArray[i++] = Integer.valueOf(value);
        }
        Arrays.sort(methodArray, Collections.reverseOrder());
        System.out.println(Arrays.toString(methodArray));
    }

}
