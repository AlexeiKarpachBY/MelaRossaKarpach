package SimpleTask;

import java.util.Arrays;

public class BinarySearch {

   // int[] testArray = {20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

    public static int binarySearch(int[] array, int mysteriousNumber) {
        Arrays.sort(array);
        int magic = -1;
        int[] testArray = new int[array.length / 2];

        if (mysteriousNumber > array[array.length - 1] | mysteriousNumber < array[0]) {
            System.out.println("The value is not in the array");
            return magic;
        }

        if (mysteriousNumber == array[array.length / 2]) {
            magic = array[array.length / 2];
            return magic;
        }

        if (mysteriousNumber > array[array.length / 2]) {
            int j = 0;
            for (int i = array.length / 2; i < array.length; i++) {
                testArray[j] = array[i];
                j++;
            }
            System.out.println(Arrays.toString(testArray)); // для проверки
        }

        if (mysteriousNumber < array[array.length / 2]) {
            int k = 0;
            for (int i = 0; i < array.length / 2; i++) {
                testArray[k] = array[i];
                k++;
            }
            System.out.println(Arrays.toString(testArray)); // для проверки
        }
        return binarySearch(testArray, mysteriousNumber);

    }

}
